package com.bootcoding.java.loops.advance_whileloop;

public class whileloop_power {
    public static void main(String[] args) {
        int num=5, p=5, result=1;
        int i=1;
        while (i<=p)
        {
            result = num*result;
            i++;
        }
        System.out.println(result);

    }
}
