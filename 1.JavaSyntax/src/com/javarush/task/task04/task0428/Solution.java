package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int a = Integer.parseInt(reader.readLine());//напишите тут ваш код
      int b = Integer.parseInt(reader.readLine());//напишите тут ваш код
      int c = Integer.parseInt(reader.readLine());//напишите тут ваш код
        int d,f,g;
        if (a>0) d=1; else d=0;
        if (b>0) f=1; else f=0;
        if (c>0) g=1; else g=0;
        System.out.println(d+f+g);

    }
}
