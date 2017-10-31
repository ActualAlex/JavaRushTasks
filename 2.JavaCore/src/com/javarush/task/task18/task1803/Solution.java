package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        int[] count = new int[256];
        int maxByte = Integer.MIN_VALUE;

        while (inputStream.available() > 0) {
            int tmp = inputStream.read();
            if (maxByte < ++count[tmp]) {
                maxByte = count[tmp];
            }
        }

        for (int i = count.length - 1; i >= 0; i--) {
            if (count[i] == maxByte) {
                System.out.print(i + " ");
            }
        }
        inputStream.close();
    }
}
