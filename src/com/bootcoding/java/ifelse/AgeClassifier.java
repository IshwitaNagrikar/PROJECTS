package com.bootcoding.java.ifelse;

public class AgeClassifier {
    public static void main(String[] args) {
        int age=17;
        if(age>0 && age<=3)
        {
            System.out.println("Infant");
        } else if(age>3 && age<=16)
        {
            System.out.println("Child");
        } else if(age>16 && age<=30)
        {
            System.out.println("Teenager");
        } else
        {
            System.out.println("Adult");
        }
    }
}
