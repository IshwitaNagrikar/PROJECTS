package com.bootcoding.java.loops.advance_forloop;

public class between_prime {
    public static void main(String[] args) {
        int a = 10, b = 20, i, j;
        for (i = a; i <= b; i++)
        {
            for ( j = 2; j <= i; j++)
            {
                if (i%j ==0)
                    break;
            }
            if (i==j)
                System.out.println(j);
        }
    }
}
