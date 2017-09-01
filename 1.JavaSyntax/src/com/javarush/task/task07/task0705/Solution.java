package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       int[] a = new int[20];
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       for (int i = 0; i < a.length; i++){
           a[i] = Integer.parseInt(reader.readLine());//напишите тут ваш код
       }
       int[] b = new int[10];
        for (int i = 0; i < b.length; i++){
            b[i] = a[i];
        }
        int[] c = new int[10];
        for (int i = 0; i < c.length; i++){
            c[i] = a[(i+10)];
            System.out.println(c[i]);
        }
    }
}
