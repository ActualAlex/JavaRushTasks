package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int c = 0;

        while (true) {
            String sum = reader.readLine();
            if (sum.equals("сумма"))
                break;

            int b = Integer.parseInt(sum);
            c += b;
        }
        System.out.println(c);
    }
}
