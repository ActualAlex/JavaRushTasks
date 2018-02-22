package com.javarush.task.task29.task2909.human;

/**
 * Created by Alex on 12.12.2017.
 */
public class UniversityPerson extends Human {
    public UniversityPerson(String name, int age) {
        super(name, age);
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    private University university;
}
