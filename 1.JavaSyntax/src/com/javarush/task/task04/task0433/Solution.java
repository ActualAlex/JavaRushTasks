package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String s ="S";
        int b = 10;
        while (b>0) {
            int a = 10;
            while (a > 0) {
                System.out.print(s);
                a--;
            }
            System.out.println();
            b--;
        }

        }


    }

