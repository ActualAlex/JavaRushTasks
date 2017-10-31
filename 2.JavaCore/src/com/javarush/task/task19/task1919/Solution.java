package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String,Double> map = new TreeMap<>();
        while (reader.ready()) {
            String s = reader.readLine();
            String[] smas = s.split(" ");
            map.merge(smas[0],Double.parseDouble(smas[1]),(a, b) -> a + b);
        }
        reader.close();
        for (Map.Entry a : map.entrySet()){
            System.out.println(a.getKey() + " " + a.getValue());
        }
    }
}
