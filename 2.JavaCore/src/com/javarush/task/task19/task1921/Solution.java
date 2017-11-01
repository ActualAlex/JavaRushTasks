package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
        while (reader.ready()){
            String s = reader.readLine();
            String[] mas = s.split(" ");
            int[] date = new int[3];
            String name = "";
            int index = mas.length - 1;
            for (int i = 0; i < 3; i++){
                date[i] = Integer.parseInt(mas[index]);
                index--;
            }
            for (int i = index; i > -1; i--){
                name = mas[index] + " " + name;
                index--;
            }
            name = name.trim();
            Date date1 = new GregorianCalendar(date[0],date[1]-1,date[2]).getTime();
            PEOPLE.add(new Person(name,date1));
        }
        reader.close();

            for (Person p : PEOPLE){
                System.out.println(p.getName() + " " + sdf.format(p.getBirthday()));
        }
    }
}
