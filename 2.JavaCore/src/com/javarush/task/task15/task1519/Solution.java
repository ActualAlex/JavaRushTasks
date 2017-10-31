package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        while (true){
            String a = reader.readLine();
            if (!a.contains("exit")){
            list.add(a);} else break;
        }

        for (String a : list) {
            try {
                if (a.contains(".")) {
                    Double d = Double.parseDouble(a);
                    print(d);
                    continue;
                }
                int i = Integer.parseInt(a);
                if (i > 0 & i < 128) {
                    print((short)i);
                    continue;
                }
                if (i <= 0 | i >= 128) {
                    print(i);
                    continue;
                }
            } catch (NumberFormatException e){

            }
            print(a);
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
