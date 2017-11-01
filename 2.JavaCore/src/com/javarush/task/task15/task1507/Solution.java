package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }


    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix (byte m, byte n, String value){
        System.out.println(m + " " + n + " " + value);
    }

    public static void printMatrix (short m, short n){
        System.out.println(m*n);
    }
    public static void printMatrix (double m, double n){
        System.out.println(m*n);
    }
    public static void printMatrix (short m, short n, short g){
        System.out.println(m*n/g);
    }
    public static void printMatrix (double m, double n, double g){
        System.out.println(m*n*g);
    }
    public static void printMatrix (Object n){
        System.out.println(n.getClass().getName());
    }
    public static void printMatrix (Integer n){
        System.out.println(n);
    }
    public static void printMatrix (String m, String n){
        System.out.println(m+n);
    }
}