package com.bootcoding.java.switch_case_statements;

public class Grades {
    public static void main(String[] args) {
        char grade = 'A' ;
        switch (grade)
        {
            case 'A' :
                System.out.println("Excellent");
                break;
            case 'B' :
                System.out.println("Good");
                break;
            case 'C' :
                System.out.println("Satisfactory");
                break;
            case 'D' :
                System.out.println("Needs Improvement");
                break;
            case 'E' :
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");

        }
    }
}
