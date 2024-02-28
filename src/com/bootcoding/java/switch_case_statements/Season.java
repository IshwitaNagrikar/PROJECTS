package com.bootcoding.java.switch_case_statements;

public class Season {
    public static void main(String[] args) {
        int Number = 6;
        switch (Number)
        {
            case 1:
                System.out.println("january = winter");
                break;
            case 2: System.out.println("february = winter");
                break;
            case 12:
                System.out.println("december = winter");
                break;

            case 3:
                System.out.println("March = Spring");
                break;
            case 4:
                System.out.println("April = Spring");
                break;
            case 5:
                System.out.println("May = Spring");
                break;

            case 6:
                System.out.println("June = Summer");
                break;
            case 7:
                System.out.println("July = Summer");
                break;
            case 8:
                System.out.println("August = Summer");
                break;

            case 9:
                System.out.println("September = Autumn");
                break;
            case 10:
                System.out.println("October = Autumn");
                break;
            case 11:
                System.out.println("November = Autumn");
                break;

            default:
                System.out.println("invalid");



        }
    }
}
