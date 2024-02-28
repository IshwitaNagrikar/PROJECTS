package com.bootcoding.java.ifelse;

public class leapyear {
    public static void main(String[] args) {
        int year = 2021;
        if (year % 4 == 0) {
            System.out.println("The given year is leap year");
        } else {
            System.out.println("The given year is not leap year");
        }
    }
}
