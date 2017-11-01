package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String,Double> map = new TreeMap<String, Double>();
        while (reader.ready()){
            String str = reader.readLine();
            String[] s = str.split(" ");
            map.merge(s[0],Double.parseDouble(s[1]),(a , b) -> a + b);
        }
        reader.close();
        TreeSet<String> nameMax = new TreeSet<>();
        double max = Double.MIN_VALUE;
        for (Map.Entry a : map.entrySet()){
            if ((double)a.getValue() >= max){
                max = (double)a.getValue();
                nameMax.add((String) a.getKey());
            }
        }

        nameMax.forEach(a -> System.out.println(a));
    }
}
