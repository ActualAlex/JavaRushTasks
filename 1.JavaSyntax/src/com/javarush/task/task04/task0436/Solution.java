package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());//напишите тут ваш код
        int n = Integer.parseInt(reader.readLine());
        for (int i = m;m>0;m--){
            for (int b = n; b>0;b--){
                System.out.print("8");
            }
            System.out.println();
        }

    }
}
