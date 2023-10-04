package com.green.prvfile;

import java.util.Scanner;

public class FlowEx17Mission {
    public static void main(String[] args) {
        System.out.println("*를 출력할 라인의 수를 입력하세요 >>");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int result = Integer.parseInt(input);

        // Case 1

        for (int i = 0; i < result; i++) {
            for (int j = result-1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Case 1-2

        for (int i = 1; i <= result; i++) {
            for (int j = result-1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Case 2 for문 2개

        for (int i = result; i > 0; i--) {
            for (int j = 1; j <= result; j++) {
                if(j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // Case 3 for문 2개 삼항식

        for (int i = result; i > 0; i--) {
            for (int j = 1; j <= result; j++) {
                System.out.printf("%s", (i > j) ? " " : "*" );
            }
            System.out.println();
        }

        // Case 3-2

        for (int i = 1; i <= result; i++) {
            for (int j = result; j > 0; j--) {
                System.out.printf("%s", j>i ? " " : "*" );
            }
            System.out.println();
        }
    }
}
