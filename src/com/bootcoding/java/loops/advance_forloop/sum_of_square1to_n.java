package com.bootcoding.java.loops.advance_forloop;

public class sum_of_square1to_n {
    public static void main(String[] args) {
        int n=10, sum_of_square =0;
        for (int i=1; i<=n; i++)
        {
            sum_of_square=sum_of_square+i*i;
        }
        System.out.println(sum_of_square);
    }
}
