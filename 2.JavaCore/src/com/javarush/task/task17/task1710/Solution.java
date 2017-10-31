package com.javarush.task.task17.task1710;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        switch (args[0]) {
            case "-c" :
                try {
                switch (args[2]) {
                    case "м":
                        allPeople.add(Person.createMale(args[1], sdf.parse(args[3])));
                        System.out.println(allPeople.size() - 1);
                        break;
                    case "ж":
                        allPeople.add(Person.createFemale(args[1], sdf.parse(args[3])));
                        System.out.println(allPeople.size() - 1);
                        break;
                }

            } catch (Exception e) {
                System.out.println("Что-то с датой");
            }
            break;

            case "-u" :
                try {
                    switch (args[3]) {
                        case "м":
                            allPeople.set(Integer.parseInt(args[1]),Person.createMale(args[2],sdf.parse(args[4])));
                            break;
                        case "ж":
                            allPeople.set(Integer.parseInt(args[1]),Person.createFemale(args[2],sdf.parse(args[4])));
                            break;
                    }

                } catch (Exception e) {
                    System.out.println("Что-то с датой");
                }
                break;

            case "-d" :
                Person person = allPeople.get(Integer.parseInt(args[1]));
                person.setBirthDay(null);
                person.setName(null);
                person.setSex(null);
                break;

            case "-i" :
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                Person person1 = allPeople.get(Integer.parseInt(args[1]));
                String sex = null;
                switch (person1.getSex()){
                    case MALE:
                        sex = "м";
                        break;
                    case FEMALE:
                        sex = "ж";
                }
                System.out.println(person1.getName()+ " " + sex + " " + simpleDateFormat.format(person1.getBirthDay()));
                break;
        }
    }
}
