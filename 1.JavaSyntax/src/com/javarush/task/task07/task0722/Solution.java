package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i > -1; i++) {
            list.add(reader.readLine());
            if (list.get(i).equals("end")) {
                list.remove(i);
                break;
            }
        }
        for (String x : list) {
            System.out.println(x);
        }
    }
}