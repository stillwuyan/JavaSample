package test;

import com.google.gson.Gson;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String json = "{\"number\": 12, \"message\": \"hello world\", \"list\": [\"John\", \"Jack\"]}";
        Gson gson = new Gson();
        TestGson obj = gson.fromJson(json, TestGson.class);
        System.out.println("number: " + obj.getNumber());
        System.out.println("mesasge: " + obj.getMessage());
        System.out.println("list: ");
        for (String str : obj.getList()) {
            System.out.println("    " + str);
        }
        return;
    }
}

class TestGson {
    private int number;
    private String message;
    List<String> list;
    public int getNumber() {
        return number;
    }
    public String getMessage() {
        return message;
    }
    public List<String> getList() {
        return list;
    }
}
