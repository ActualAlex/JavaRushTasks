package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(4655));
    }

    public static int sumDigitsInNumber(int number) {
        int i = number/100;
        int b = (number%100)/10;
        int c = (number%100)%10;
        int d = i+b+c;
        return d;
        //напишите тут ваш код
    }
}