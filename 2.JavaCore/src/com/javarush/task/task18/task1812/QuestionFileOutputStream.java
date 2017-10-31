package com.javarush.task.task18.task1812;

import java.io.*;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    private AmigoOutputStream com;

    public QuestionFileOutputStream(AmigoOutputStream com){
        this.com = com;
    }

    @Override
    public void flush() throws IOException {
com.flush();
    }

    @Override
    public void write(int b) throws IOException {
com.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
com.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
com.write(b,off,len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        if (s.equals("Д")){
            com.close();
        }
    }
}

