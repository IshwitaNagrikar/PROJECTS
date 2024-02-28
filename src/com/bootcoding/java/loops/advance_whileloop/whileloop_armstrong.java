package com.bootcoding.java.loops.advance_whileloop;

public class whileloop_armstrong {
    public static void main(String[] args) {
        int arm=0, i=153, c=153;
        while (i != 0)
        {
            int num = i%10;
            arm = (num*num*num) + arm;
            i = i/10;
        }
        if (c==arm)
        {
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not Armstrong");
        }
    }
}
