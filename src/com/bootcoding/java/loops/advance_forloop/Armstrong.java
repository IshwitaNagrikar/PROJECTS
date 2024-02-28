package com.bootcoding.java.loops.advance_forloop;
//1234 ----> (1*1*1 +2*2*2 +3*3*3 +4*4*4 =1234)
public class Armstrong {
    public static void main(String[] args) {
        int arm = 0;
        int c = 154;
        for (int i = 154; i != 0; i = i / 10) {

            int num = i % 10;
            arm = (num * num * num) + arm;
        }

        if (c == arm) {
            System.out.println("Amstrong");
        } else {
            System.out.println("not amstrong");
        }
    }
}

