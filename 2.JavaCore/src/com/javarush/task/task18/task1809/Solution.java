package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        FileInputStream inputStream = new FileInputStream(s1);
        FileOutputStream outputStream = new FileOutputStream(s2);

        ArrayList<Integer> arrayList = new ArrayList<>();

        while (inputStream.available() > 0){
            arrayList.add(inputStream.read());
        }

        for (int i = arrayList.size()-1; i >= 0; i--){
            outputStream.write(arrayList.get(i));
        }
        inputStream.close();
        outputStream.close();

    }
}
