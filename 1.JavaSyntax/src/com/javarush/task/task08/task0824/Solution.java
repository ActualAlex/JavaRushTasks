package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
    Human a1 = new Human("Mari",true,15) ;//напишите тут ваш код
    Human a2 = new Human("Mari",true,15) ;//напишите тут ваш код
    Human a3 = new Human("Mari",true,15) ;//напишите тут ваш код
        ArrayList<Human> list = new ArrayList<>(Arrays.asList(a1,a2,a3));//напишите тут ваш код
        Human father = new Human("f", true, 65, list);
        Human mother = new Human("m", false, 65, list);
        Human granpa = new Human("granpa", true, 65, new ArrayList<>(Collections.singletonList(father)));
        Human granpa1 = new Human("granpa", true, 65, new ArrayList<>(Collections.singletonList(mother)));
        Human granma = new Human("granma", false, 65, new ArrayList<>(Collections.singletonList(father)));
        Human granma1 = new Human("granma1", false, 65,new ArrayList<>(Collections.singletonList(mother)));

        System.out.println(granpa);
        System.out.println(granpa1);
        System.out.println(granma);
        System.out.println(granma1);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();//напишите тут ваш код

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
