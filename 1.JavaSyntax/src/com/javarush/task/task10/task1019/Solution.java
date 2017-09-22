package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String,Integer> map = new HashMap<>();
        try {
            while (true) {
                int a = Integer.parseInt(reader.readLine());
                String a1 = String.valueOf(a);
                if (a1.isEmpty()) {
                    break;
                }
                String name = reader.readLine();
                if (name.isEmpty()) {
                    break;
                }
                map.put(name, a);
            }
        } catch (NumberFormatException e) {

            for (Map.Entry<String, Integer> a : map.entrySet()) {
                int b = a.getValue();
                String c = a.getKey();

                System.out.println(b + " " + c);
            }
        }
    }
}
