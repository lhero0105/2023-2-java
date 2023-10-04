package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17Mission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*를 출력할 라인의 수를 입력하세여 >>");
        int line = scanner.nextInt();

        // Case 1 // num-i
        for (int i = 0; i < line; i++) {
            for (int j = line-1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        for (int i = 1; i <= line; i++) {
//            for (int j = line-i; j >= i; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Case 2 for문 2개
        for (int i = line; i > 0 ; i--) {
            for (int j = 1; j <= line ; j++) {
                if (j < i){ // j < i 핵심입니다.
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // Case 3 for문 2개 삼항식
        for (int i = line; i > 0 ; i--) {
            for (int j = 1; j <= line ; j++) {
                System.out.print(j < i ? " " : "*");
            }
            System.out.println();
        }
    }
}
