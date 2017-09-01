package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandpa1 = new Human("Андрей", true, 60);
        Human grandma1 = new Human("Таня", false, 55);
        Human grandma2 = new Human("Маня", false, 50);
        Human grandpa2 = new Human("Петя", true, 65);
        Human father = new Human("Витя", true, 35, grandpa1, grandma1);
        Human mother = new Human("Леся", false, 30, grandpa2, grandma2);
        Human child1 = new Human("Дима", true, 16, father, mother);
        Human child2 = new Human("Наташа", false, 13, father, mother);
        Human child3 = new Human("Вася", true, 10, father, mother);
        System.out.println(grandpa1);
        System.out.println(grandma1);
        System.out.println(grandpa2);
        System.out.println(grandma2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);//напишите тут ваш код
    }

    public static class Human {
       private String name;
       private boolean sex;
       private int age;
       private Human father;
       private Human mother;//напишите тут ваш код

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















