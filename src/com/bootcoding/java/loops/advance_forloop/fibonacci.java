package com.bootcoding.java.loops.advance_forloop;
//0 1 1 2 3 5 8 13 21 34
public class fibonacci {
    public static void main(String[] args) {
        int a=0, b=1, c;
        for (int i=1; i<=10; i++)
        {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;

        }
    }
}
