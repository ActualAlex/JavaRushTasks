package com.javarush.task.task21.task2109;

/* 
Запретить клонирование
*/
public class Solution {
    public static class A implements Cloneable {
        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }

        @Override
        protected A clone() throws CloneNotSupportedException {
            return (A)super.clone();
        }

                @Override
        public int hashCode() {
            int result;
            result = 31 * i + j;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof A)) return false;

            A a = (A) obj;
            if (i != a.i) return false;
            return j == a.j;
        }
    }

    public static class B extends A {
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name1){
            name = name1;
        }

        @Override
        protected B clone() throws CloneNotSupportedException {
            throw new CloneNotSupportedException();
        }
    }

    public static class C extends B implements Cloneable{
        public C(int i, int j, String name) {
            super(i, j, name);
        }

        @Override
        protected C clone() throws CloneNotSupportedException {
            int i = getI();
            int j = getJ();
            String name = getName();
           return new C(i,j,name);
        }

        @Override
        public int hashCode() {
            int result = super.hashCode();
            result = 31 * result + (getName() != null ? getName().hashCode() : 0);
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                C c = (C) obj;
                if (c.getName() != null ? getName().equals(c.getName()) : c.getName() == null) return true;
            } return false;
        }


    }

    public static void main(String[] args) throws CloneNotSupportedException {
       C a = new C(1,1,"CCC");
        C a1 = a.clone();
        System.out.println(a1.hashCode());
        System.out.println(a.hashCode());

    }

}
