package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

        while (reader.ready()){
            String file1 = reader.readLine();
            String[] s = file1.split(" ");
            for (String a : s){
            if (a.matches(".*\\d.*")) {
                writer.write(a + " ");
            }
            }
        }
        reader.close();
        writer.close();
    }
}
