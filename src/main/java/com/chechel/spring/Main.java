package com.chechel.spring;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        System.out.println("===========================");
        hashMap.put(null, "1");
        String a = new String("A");
        hashMap.put(a, "A");
        System.out.println("hashCode " +a.hashCode());
        System.out.println(hashMap);
        System.out.println("===========================");
        hashMap.put(null, "11");
        hashMap.put("d", "Aa");
        System.out.println("hashCode " +a.hashCode());
        System.out.println(hashMap);
        System.out.println("===========================");
    }
}
