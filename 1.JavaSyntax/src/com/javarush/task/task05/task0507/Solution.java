package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
       double a=0, b=0,s=0,dd=0;
       while (s<1){
           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           int d = Integer.parseInt(reader.readLine());
           if (d>=0 | d<-1) {
               a+=d;
               b++;
           } else if (d==-1) {
               dd= a/b;
               System.out.println(dd);
               s++;
           }
       }
    }
}

