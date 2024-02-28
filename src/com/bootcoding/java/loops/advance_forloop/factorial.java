package com.bootcoding.java.loops.advance_forloop;

public class factorial {
    public static void main(String[] args) {
        long fact =1;
        for (int num = 5; num>=1; num--)
        {
            fact = fact*num;
        }
        System.out.println(fact);
    }
}
