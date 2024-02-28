package com.bootcoding.java.switch_case_statements;

public class workday
{
    public static void main(String[] args) {


    int day = 6;
        switch (day)
    {
        case 1:
            System.out.println("Monday = Workday");
            break;
        case 2:
            System.out.println("Tuesday = Workday");
            break;
        case 3:
            System.out.println("Wednesday = Workday");
            break;
        case 4:
            System.out.println("Thursday = Workday");
            break;
        case 5:
            System.out.println("Friday = Workday");
            break;
        case 6:
            System.out.println("Saturday = Half day OR holiday");
            break;
        case 7:
            System.out.println("Sunday = Holiday");
            break;
        default:
            System.out.println("Invalid day");
    }
}
}

