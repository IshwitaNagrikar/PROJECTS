package com.bootcoding.java.loops.advance_whileloop;

public class whileloop_factorial {
    public static void main(String[] args) {
        int fact=1, num=5;
        while (num>=1)
        {
            fact =fact*num;
            num--;
        }
        System.out.println("Factorial of the given number: " +fact);
    }
}
