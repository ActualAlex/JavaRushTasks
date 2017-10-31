package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()));

        while (fileReader.ready()){
            String line = fileReader.readLine();
            fileWriter.write(line.replaceAll("[\\p{Punct}\\n]",""));
        }
        reader.close();
        fileReader.close();
        fileWriter.close();
    }
}
