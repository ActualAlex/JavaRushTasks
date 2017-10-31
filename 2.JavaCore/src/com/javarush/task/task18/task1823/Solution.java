package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String file = bf.readLine();
            if (file.equals("exit")) break;
            ReadThread thread = new ReadThread(file);
            thread.start();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;
        private  byte b;
        public ReadThread(String fileName) {
            this.fileName = fileName;// implement constructor body
        }

        @Override
        public void run() {
            HashMap<Byte,Integer> map = new HashMap<Byte,Integer>();
            try {
                FileInputStream fileInputStream = new FileInputStream(fileName);
                while (fileInputStream.available() > 0){
                    byte[] bytes = new byte[fileInputStream.available()];
                    fileInputStream.read(bytes);

                    for (byte b : bytes){
                        if (map.containsKey(b)){
                            map.put(b,map.get(b) + 1);
                        } else map.put(b, 1);
                    }
                }
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            int max = 0;
            for (Map.Entry<Byte,Integer> a : map.entrySet() ){
                if (max < a.getValue()){
                    b = a.getKey();
                    max = a.getValue();
                }
            }
            synchronized (resultMap) {
                resultMap.put(this.fileName, (int) this.b);
            }
        }




        // implement file reading here - реализуйте чтение из файла тут
    }
}
