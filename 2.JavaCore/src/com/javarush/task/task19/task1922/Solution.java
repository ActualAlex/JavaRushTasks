package com.javarush.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1 = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        while (reader1.ready()) {
            int count = 0;
            String file = reader1.readLine();
            for (String s : words) {
                if (file.contains(s)){
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(file);
            }
        }
        reader1.close();
    }
}
