package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] s = new String[10];
        int[] a = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < s.length; i++) {
            s[i] = reader.readLine();
            a[i] = s[i].length();//напишите тут ваш код
        }
        for (int i = 0; i < s.length; i++) {
            System.out.println(a[i]);
        }
    }
}
