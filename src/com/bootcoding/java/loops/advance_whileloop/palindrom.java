package com.bootcoding.java.loops.advance_whileloop;

public class palindrom {
    public static void main(String[] args) {
        int num=12321;
        int a=num, c=0;
        while (num != 0)
        {
            int result = num%10;
            c=c*10+result;
            num=num/10;
        }
        if (a==c)
        {
            System.out.println(a+ " is the palindrome number");
        }
        else {
            System.out.println(a+ " is not the palindrome number");
        }
    }
}
