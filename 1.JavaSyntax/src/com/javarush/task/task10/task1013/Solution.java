package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String profession;
        private String nationality;
        private int age;
        private int money;
        private char sex;

        public Human(String profession, String nationality, int money) {
            this.profession = profession;
            this.nationality = nationality;
            this.money = money;
        }

        public Human(int money, char sex) {
            this.money = money;
            this.sex = sex;
        }

        public Human(String profession, int money) {

            this.profession = profession;
            this.money = money;
        }

        public Human(String name, char sex) {

            this.name = name;
            this.sex = sex;
        }

        public Human(String name, String profession, String nationality, int age, int money) {

            this.name = name;
            this.profession = profession;
            this.nationality = nationality;
            this.age = age;
            this.money = money;
        }

        public Human(String name, String profession, String nationality, int age) {

            this.name = name;
            this.profession = profession;
            this.nationality = nationality;
            this.age = age;
        }

        public Human(String name, String profession, String nationality) {

            this.name = name;
            this.profession = profession;
            this.nationality = nationality;
        }

        public Human(String name) {

            this.name = name;
        }

        public Human(String name, String profession) {

            this.name = name;
            this.profession = profession;
        }

        public Human(String name, String profession, String nationality, int age, int money, char sex) {

            this.name = name;
            this.profession = profession;
            this.nationality = nationality;
            this.age = age;
            this.money = money;
            this.sex = sex;
        }

// напишите тут ваши переменные и конструкторы
    }
}
