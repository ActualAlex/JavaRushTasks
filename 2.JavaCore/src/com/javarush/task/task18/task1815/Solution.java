package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements ATableInterface {
        private ATableInterface tab;

        public TableInterfaceWrapper(ATableInterface tab1){
            this.tab = tab1;
        }
        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            tab.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return tab.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
        tab.setHeaderText(newHeaderText);
        }
    }

    public interface ATableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}