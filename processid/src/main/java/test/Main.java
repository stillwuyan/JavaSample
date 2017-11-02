package test;

public class Main {
    public static void main(String[] args) throws Exception {
        String name = java.lang.management.ManagementFactory.getRuntimeMXBean().getName();
        System.out.println(name);
        while(true) {
            Thread.sleep(1000);
        }
    }
}

