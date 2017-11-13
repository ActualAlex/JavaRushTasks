package com.javarush.task.task19.task1924;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static {
        map.put(0,"ноль");
        map.put(1,"один");
        map.put(2,"два");
        map.put(3,"три");
        map.put(4,"четыре");
        map.put(5,"пять");
        map.put(6,"шесть");
        map.put(7,"семь");
        map.put(8,"восемь");
        map.put(9,"девять");
        map.put(10,"десять");
        map.put(11,"одиннадцать");
        map.put(12,"двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1 = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        while (reader1.ready()){
            String str = reader1.readLine();
            String[] mas = str.split(" ");
            String n = "";
            for (String s : mas){
                switch (s) {
                    case "0" : s = map.get(0); break;
                    case "1" : s = map.get(1); break;
                    case "2" : s = map.get(2); break;
                    case "3" : s = map.get(3); break;
                    case "4" : s = map.get(4); break;
                    case "5" : s = map.get(5); break;
                    case "6" : s = map.get(6); break;
                    case "7" : s = map.get(7); break;
                    case "8" : s = map.get(8); break;
                    case "9" : s = map.get(9); break;
                    case "10" : s = map.get(10); break;
                    case "11" : s = map.get(11); break;
                    case "12" : s = map.get(12); break;
                }
               n = n + s + " ";
            }
            n = n.trim();
            System.out.println(n);
        }
        reader1.close();
    }
}
