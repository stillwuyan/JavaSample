package test;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean flag = false;
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.out.println("process will exit!");
                for (int i = 0; i < 10; i++) {
                    System.out.println("hook thread: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch(Exception e) {
                        System.out.println(e.toString());
                    }
                }
                System.out.println("hook thread end!");
            }
        });
        Thread loop = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 35; i++) {
                    System.out.println("sub thread: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch(Exception e) {
                        System.out.println(e.toString());
                    }
                }
                System.out.println("sub thread end!");
            }
        };
        loop.start();
        for (int i = 0; i < 30; i++) {
            System.out.println("main thread: " + i);
            Thread.sleep(1000);
        }
        System.out.println("main thread end!");
    }
}

