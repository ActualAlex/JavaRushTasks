package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        int count = 0;
        while (fileReader.ready()){
            String s = fileReader.readLine();
            String[] w = s.toString().split("\\W");
            for (String a : w){
                if (a.equals("world")){
                    count++;
                }
            }
        }
        fileReader.close();
        System.out.println(count);

    }
}
