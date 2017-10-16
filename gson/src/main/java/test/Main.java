package test;

import com.google.gson.Gson;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String json = "{" +
            "\"year\": 2017," +
            "\"message\": \"Hello world\"," +
            "\"countries\": [" +
                "\"America\"," +
                "\"China\"" +
            "]," +
            "\"contacts\": [" +
                "{" +
                    "\"phone\": 13912345678," +
                    "\"name\": \"John\"" +
                "}," +
                "{" +
                    "\"phone\": 15087654321," +
                    "\"name\": \"Tom\"" +
                "}" +
            "]" +
        "}";
        System.out.println(json);
        Gson gson = new Gson();
        TestData obj = gson.fromJson(json, TestData.class);
        System.out.println("year: " + obj.getYear());
        System.out.println("mesasge: " + obj.getMessage());
        if (obj.getCountries() == null) {
            System.out.println("countries is null");
        } else {
            System.out.println("countries: ");
            for (String str : obj.getCountries()) {
                System.out.println("  " + str);
            }
        }
        if (obj.getContacts() == null) {
            System.out.println("contacs is null");
        } else {
            System.out.println("contacts: ");
            for (Contact data : obj.getContacts()) {
                System.out.println("  phone: " + data.getPhone());
                System.out.println("  name: " + data.getName());
            }
        }
        return;
    }
}

class TestData {
    private int year;
    private String message;
    List<String> countries;
    List<Contact> contacts;
    public int getYear() {
        return year;
    }
    public String getMessage() {
        return message;
    }
    public List<String> getCountries() {
        return countries;
    }
    public List<Contact> getContacts() {
        return contacts;
    }
}
class Contact {
    private long phone;
    private String name;
    public long getPhone() {
        return phone;
    }
    public String getName() {
        return name;
    }
}
