package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    int top, left, width, height;

    public void initialize(int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public void initialize(int left, int top) {
        this.left = left;
        this.top = top;
        this.width = 0;
        this.height = 0;
    }

    public void initialize(int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }

    public void initialize(Rectangle a){
        this.top = a.top;
        this.left = a.left;
        this.width = a.width;
        this.height = a.height;
    }
        public static void main(String[] args) {

    }
}
