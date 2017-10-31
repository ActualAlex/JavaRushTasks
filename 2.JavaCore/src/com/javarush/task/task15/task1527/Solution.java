package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String url = reader.readLine();

        String [] arr = url.split("\\?");
        String [] arr2 = arr[1].split("&");

        for (String x : arr2) {
            String[] arr3 = x.split("=");
            System.out.print(arr3[0] + " ");
        }

        System.out.println();

        for (String x : arr2) {
            if (x.contains("obj")) {
                String[] arr4 = x.split("=");
                try {
                    alert(Double.parseDouble(arr4[1]));
                } catch (Exception e) {
                    alert(arr4[1]);
                }
            }

        }
        reader.close();
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
