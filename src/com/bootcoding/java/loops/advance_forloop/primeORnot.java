package com.bootcoding.java.loops.advance_forloop;

public class primeORnot {
    public static void main(String[] args) {
        int n=10;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Not prime number");
                return;
            }

        }
                System.out.println("Prime number");

        }
    }

