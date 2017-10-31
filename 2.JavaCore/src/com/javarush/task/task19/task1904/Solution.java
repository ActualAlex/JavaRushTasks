package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            Person person = null;
            if (fileScanner.hasNext()){
                String s = fileScanner.nextLine();
                String name[] = s.split(" ");
                String firstName = name[1];
                String middleName = name[2];
                String lastName = name[0];
                Calendar birthDate = new GregorianCalendar(Integer.parseInt(name[5]), Integer.parseInt(name[4])-1, Integer.parseInt(name[3]));
                person = new Person(firstName,middleName,lastName,birthDate.getTime());

            }
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();

        }
    }
}
