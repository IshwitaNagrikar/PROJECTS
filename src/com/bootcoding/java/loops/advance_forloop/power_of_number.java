package com.bootcoding.java.loops.advance_forloop;

public class power_of_number {
    public static void main(String[] args) {
        int n = 5, p = 3, result=1;
        for (int i = 1; i <=p; i++)
        {
         result=n*result;
        }
        System.out.println(result);
    }
}
