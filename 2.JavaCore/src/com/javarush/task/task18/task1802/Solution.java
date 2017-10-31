package com.javarush.task.task18.task1802;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream inputStream = new FileInputStream(s);
        int min = Integer.MAX_VALUE;
        while (inputStream.available()>0){
            int a = inputStream.read();
            if (min > a) {
                min = a;
            }
        }
        reader.close();
        inputStream.close();
        System.out.println(min);
    }
}
