package com.bootcoding.java.switch_case_statements;

public class CharacterCheck {
    public static void main(String[] args) {
        char ch = 'a';

        switch(Character.getType(ch)) {
            case Character.UPPERCASE_LETTER:
                System.out.println("The character is uppercase.");
                break;
            case Character.LOWERCASE_LETTER:
                System.out.println("The character is lowercase.");
                break;
            default:
                System.out.println("The character is neither uppercase nor lowercase.");
        }
    }
}

