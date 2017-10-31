package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader(args[0]);
        int p = 0;
        int s = 0;
        while (reader.ready()){
            char c = (char) reader.read();
            s++;

            if (c == ' '){
                p++;
            }
        }
        reader.close();
        System.out.printf("%.2f",(float) p/s*100);
    }
}
