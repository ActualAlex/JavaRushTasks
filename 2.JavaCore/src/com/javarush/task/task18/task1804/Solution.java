package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        HashMap<Integer,Integer> map = new HashMap<>();
        int value = 0;
        Integer count = 0;
        while (inputStream.available() > 0){
            value = inputStream.read();
            count = map.get(value);
            if (count != null)
                count++;
             else count = 0;
            map.put(value,count);
        }
        inputStream.close();

        boolean f = true;
        int min = 0;
        for (int b : map.values()){
            if (f){
                min = b;
                f = false;
            }
            if (b < min){
                min = b;
            }
        }

        for (Map.Entry p : map.entrySet()){
            if (min == (int) p.getValue()){
                System.out.print(p.getKey()+" ");
            }
        }
    }
}
