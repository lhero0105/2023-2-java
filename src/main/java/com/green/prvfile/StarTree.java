package com.green.prvfile;

import java.util.Scanner;

public class StarTree {
    public static void main(String[] args) {
        System.out.println("별 찍을 갯수를 입력하세요 >> ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int input = Integer.parseInt(str);
        for (int i = 1; i <= input; i++) {
            for (int j = input - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int z = 0; z < i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
