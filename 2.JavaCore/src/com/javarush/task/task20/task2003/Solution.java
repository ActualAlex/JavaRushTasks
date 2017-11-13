package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        reader.close();
        load(inputStream);//implement this method - реализуйте этот метод
    }

    public void save(OutputStream outputStream) throws Exception {
        PrintWriter writer = new PrintWriter(outputStream);
        Properties prop = new Properties();
        prop.putAll(properties);
        prop.store(writer,null);
        writer.close();//implement this method - реализуйте этот метод
    }

    public void load(InputStream inputStream) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        Properties prop = new Properties();
        prop.load(inputStream);
        for (final String name : prop.stringPropertyNames()){
            properties.put(name,prop.getProperty(name));
        }
        reader.close();
    }

    public static void main(String[] args) throws Exception {

    }
}
