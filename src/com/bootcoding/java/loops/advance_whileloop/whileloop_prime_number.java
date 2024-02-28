package com.bootcoding.java.loops.advance_whileloop;

public class whileloop_prime_number {
    public static void main(String[] args) {
        int num =2;
        int count;
        while (num<=100)
        {
            count =0;
            int i =2;
            while (i<=num/2)
            {
                if (num %i==0)
                {
                    count++;
                    break;
                }
                i++;
            }
            if (count ==0 && num != 1)
            {
                System.out.println(num);
            }
            num++;
        }
    }
}
