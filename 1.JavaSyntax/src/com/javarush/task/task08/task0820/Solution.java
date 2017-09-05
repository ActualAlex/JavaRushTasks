package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        result.add(new Cat());//напишите тут ваш код
        result.add(new Cat());//напишите тут ваш код
        result.add(new Cat());//напишите тут ваш код
        result.add(new Cat());//напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> dogs = new HashSet<>();//напишите тут ваш код
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet<Object> pats = new HashSet<>();
       pats.addAll(cats);
       pats.addAll(dogs);
        //напишите тут ваш код
        return pats;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);//напишите тут ваш код
    }

    public static void printPets(Set<Object> pets) {
        Iterator<Object> it = pets.iterator();
        while (it.hasNext()){
            System.out.println(it.next());//напишите тут ваш код
        }
    }

    public static class Cat {
    }

    public static class Dog {
    }//напишите тут ваш код
}
