package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int b = 0;
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());//напишите тут ваш код
        }
        for (int i = 0; i < list.size(); i++) {
            if (b < list.get(i).length()) b = list.get(i).length();
        }
        for (int i = 0; i < list.size(); i++) {
            if (b == list.get(i).length()) System.out.println(list.get(i));
        }
    }
}
