package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a == 1) {
            System.out.println("понедельник");//напишите тут ваш код
        }
        if (a == 2) {
            System.out.println("вторник");
        }
        if (a == 3) {
            System.out.println("среда");
        }
        if (a == 4) {
            System.out.println("четверг");
        }
        if (a == 5) {
            System.out.println("пятница");
        }
        if (a == 6) {
            System.out.println("суббота");
        }
        if (a == 7) {
            System.out.println("воскресенье");
        }
        if (a <= 0 || a > 7) {
            System.out.println("такого дня недели не существует");
        }
    }
    }
