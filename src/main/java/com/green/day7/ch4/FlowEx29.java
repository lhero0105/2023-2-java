package com.green.day7.ch4;

public class FlowEx29 {
    public static void main(String[] args) {
        //3,6,9게임
        /*
        i=1
        i=2
        i=3 짝
        ...
        i=30 짝
        i=33 짝
        i=99 짝
         */

        // Case 1
        for (int i = 1; i <= 100; i++) {
            System.out.printf("i=%d", i);
            int temp = i;
            do{
                if (temp % 10 % 3 == 0 && temp%10!=0) {
                    System.out.print("짝");
                }
            }while ((temp/=10) != 0);
            System.out.println();
        }

        // Case 2
        for (int i = 0; i < 101; i++) {
            System.out.printf("i=%d", i);
            int temp = i;
            while (temp > 0){
                int modVal = temp % 10;
                if(modVal != 0 && modVal % 3 == 0){
                    System.out.print("짝");
                }
                temp /= 10;
            }
            System.out.println();
        }
    }
}