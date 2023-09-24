package org.example;
import com.google.gson.JsonObject;


public class App {
    public static void main(String[] args) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "Olena");
        jsonObject.addProperty("lastName", "Derevianko");

        System.out.println(jsonObject);
    }
}