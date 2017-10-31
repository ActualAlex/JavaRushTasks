package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();

        while (fileReader.ready()){
            String a = fileReader.readLine();
            String[] b = a.split("\\s" );
            for (String c : b){
                try {
                    Integer.parseInt(c);
                    fileWriter.write(c + " ");
                } catch (NumberFormatException e) {
                    continue;
                }
            }
        }
        fileReader.close();
        fileWriter.close();
    }
}
