package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

import static com.javarush.task.task09.task0919.Solution.divisionByZero;

public class Solution {

    public static void main(String[] args) {
        try {
            divisionByZero();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void divisionByZero() throws Exception {
        int a = 4 / 0;
        System.out.println(a);
    }
    }