package com.bootcoding.java.ifelse;

public class Whether {
    public static void main(String[] args) {
        int temp =70;
        if(temp<20)
        {
            System.out.println("Cool");
        } else if(temp>20 && temp<30)
        {
            System.out.println("Normal");
        } else if(temp>30 && temp<40)
        {
            System.out.println("Hot");
        } else if(temp>40)
        {
            System.out.println("Warm");
        }


    }
}
