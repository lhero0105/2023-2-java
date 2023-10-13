package com.green.extra.day1;

import java.util.Scanner;

public class OperatorEx19 {
    public static void main(String[] args) {
        int x = 10, y = 8;
        System.out.printf("x / y = %d, 나머지값: %d\n",10/8, 10%8);

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.printf("Val: %d >", input);
        int val = (int)(Math.random()*10)+1; // 1~10 랜덤값 나오게
        System.out.println(input%2 == 0 ? "짝수입니다." : "홀수입니다.");


        // val: 2 > 짝수입니다.
        // val: 3 > 홀수입니다.
    }
}