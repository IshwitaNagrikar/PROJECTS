package com.bootcoding.java.loops.advance_forloop;

public class sum_of_all_natural_number {
    public static void main(String[] args) {
        int a=0, b=10, sum = 0;
        for (int i=a+1; i<=10; i++)
        {
             sum =sum+i;
        }
        System.out.println("Sum of natural number between two given number is:  " +sum);
    }
}
