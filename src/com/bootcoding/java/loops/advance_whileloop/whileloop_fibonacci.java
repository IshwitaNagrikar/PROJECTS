package com.bootcoding.java.loops.advance_whileloop;

public class whileloop_fibonacci {
    public static void main(String[] args) {
        int a=0, b=1, c;
        int i=1;
        while (i<=10)
        {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
            i++;
        }
    }
}
