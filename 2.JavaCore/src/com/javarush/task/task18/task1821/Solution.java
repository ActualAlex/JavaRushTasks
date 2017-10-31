package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<Byte,Integer> treeMap = new TreeMap<Byte,Integer>();
        FileInputStream fileInputStream = new FileInputStream(args[0]);

        while (fileInputStream.available() > 0) {
            byte[] file = new byte[fileInputStream.available()];
            fileInputStream.read(file);

            for (int i = 0; i < file.length; i++) {
                if (treeMap.containsKey(file[i])) treeMap.put(file[i], treeMap.get(file[i]) + 1);
                else treeMap.put(file[i], 1);
            }
        }
        fileInputStream.close();

        for (Map.Entry a : treeMap.entrySet()){
            System.out.println((char)((byte)a.getKey()) + " " + a.getValue());
        }
    }
}
