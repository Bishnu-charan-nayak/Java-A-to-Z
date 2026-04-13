package com.map.wwwJav8;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MyLinkedHashmap   {
    public static void main(String[] args) {

        LinkedHashMap<String, String> hs = new LinkedHashMap<>();

        hs.put("FirstName", "Bishnu Charan");
        hs.put("LastName", "Nayak");
        hs.put("Age", "23");
        hs.put("email", "bishnubablu203@gmail.com");
        hs.put("gender", "Male");
        hs.put("pass", "Bishnu@!#");

        // Entry Set
        Set<Entry<String, String>> entrySet = hs.entrySet();

        for (Entry<String, String> es : entrySet) {
            System.out.println(es.getKey() + " : " + es.getValue());
        }
    }
}