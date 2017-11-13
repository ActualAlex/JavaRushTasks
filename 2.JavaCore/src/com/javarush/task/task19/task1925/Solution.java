package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

        String file2 = "";
        while (reader.ready()){
            String[] file1 = reader.readLine().split(" ");
            for (String s : file1){
                if (s.length() > 6) {
                    file2 = file2 + s + ",";
                }
            }
        }
        file2 = file2.substring(0,file2.length()-1);
        writer.write(file2);

        reader.close();
        writer.close();
    }
}
