package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int a = Integer.parseInt(reader.readLine());//напишите тут ваш код
      int b = Integer.parseInt(reader.readLine());
      if (a<b) {
          System.out.println(a);
      } else if (b<a) {
          System.out.println(b);
      } else System.out.println(b);
    }
}