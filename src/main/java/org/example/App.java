package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello There!");
    }

    public static List<String> names() {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        return names;
    }

}
