package com.bootcoding.java.loops.advance_whileloop;

public class whileloop_counter {
    public static void main(String[] args) {
        int num = 767465854;
        int count=0;
        while (num>0)
        {
            num = num/10;
            count++;
        }
        System.out.println(count);
    }
}
