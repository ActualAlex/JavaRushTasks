package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        ArrayList<Integer> arr = new ArrayList<>();

        while (in.ready()){
            int a = Integer.parseInt(in.readLine());
            arr.add(a);
        }
        reader.close();
        in.close();

        arr.removeIf(b -> b%2 !=0);

        Collections.sort(arr);

        for (Integer a : arr){
            System.out.println(a);
        }
    }
}
