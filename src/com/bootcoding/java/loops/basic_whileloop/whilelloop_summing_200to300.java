package com.bootcoding.java.loops.basic_whileloop;

public class whilelloop_summing_200to300 {
    public static void main(String[] args) {
        int num=200, sum=0;
        while (num<=300)
        {
             sum=sum+num;

            num++;
        }
        System.out.println(sum);
    }
}
