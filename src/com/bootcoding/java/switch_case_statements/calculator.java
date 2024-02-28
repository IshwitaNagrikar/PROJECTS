package com.bootcoding.java.switch_case_statements;

public class calculator {
    public static void main(String[] args) {
        int num1 = 84, num2=2 , add, sub, mul, div;
        char operator ='*';
        switch (operator)
        {
            case '+' : add = num1+num2;
                System.out.println("Addition: " +add);
                break;
            case '-' : sub = num1-num2;
                System.out.println("Substraction: " +sub);
                break;
            case '*' : mul = num1*num2;
                System.out.println("Multiplication: " +mul);
                break;
            case '/' : div = num1/num2;
                System.out.println("Division: " +div);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
