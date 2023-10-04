package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args) {
        // 스캐너를 이용하여 정수를 입력받습니다.
        // "*을 출력할 라인의 수를 입력 하세요 >>"
        // 만약 3을 입력
        /*
        *
        **
        ***
        */
        // 만약 4을 입력
        /*
         *
         **
         ***
         ****
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("*을 출력할 라인의 수를 입력 하세요 >>");
        int input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*for (int i = 0; i < input; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
    }
}