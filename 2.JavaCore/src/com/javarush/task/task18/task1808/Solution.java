package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(s1);
        FileOutputStream outputStream1 = new FileOutputStream(s2);
        FileOutputStream outputStream2 = new FileOutputStream(s3);

        byte[] buffer = new byte[inputStream.available()];

        while (inputStream.available() > 0){
            int count = inputStream.read(buffer);
            int a = count/2;
            if (count%2 == 0) {
                outputStream1.write(buffer,0,a);
                outputStream2.write(buffer,a,a);
            } else {
                outputStream1.write(buffer,0,++a);
                outputStream2.write(buffer,a,count-a);
            }
        }

        reader.close();
        inputStream.close();
        outputStream1.close();
        outputStream2.close();

    }
}
