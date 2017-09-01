package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;
        int x[] = new int[20];
        for (int i = 0; i < 20; i++) {
            x[i] = Integer.parseInt(reader.readLine());
        }
        minimum = x[0];
        maximum = x[0];
        for (int i = 0; i < x.length; i++) {
            if (maximum < x[i]) {
                maximum = x[i];
            }
            if (minimum > x[i]) {
                minimum = x[i];
            }
        }

        System.out.println(maximum + " " + minimum);

    }
}
