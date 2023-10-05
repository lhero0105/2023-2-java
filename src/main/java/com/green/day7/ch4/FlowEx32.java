package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {


    /*
    (1) square
    (2) tri
    (3) log
    원하는 메뉴(1~3)를 선택하세요. (종료 : 0)>>

    위 내용이 계속 반복 (0을 입력하기 전까지)

    e.g.

    (1) square
    (2) tri
    (3) log
    원하는 메뉴(1~3)를 선택하세요. (종료 : 0)>> 1 (엔터)
    선택하신 메뉴는 1번입니다.
    (1) square
    (2) tri
    (3) log
    원하는 메뉴(1~3)를 선택하세요. (종료:0) >> 2 (엔터)
    선택하신 메뉴는 2번입니다.

    (1) square
    (2) tri
    (3) log
    원하는 메뉴(1~3)를 선택하세요. (종료:0) >> 4 (엔터)
    메뉴를 잘못 선택하셨습니다.

    (1) square
    (2) tri
    (3) log
    원하는 메뉴(1~3)를 선택하세요. (종료:0) >> 0 (엔터)
    프로그램을 종료합니다.
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "    (1) square\n" +
                        "    (2) tri\n" +
                        "    (3) log\n" +
                        "    원하는 메뉴(1~3)를 선택하세요. (종료 : 0)>>");
        int input = scanner.nextInt();


        loop1:
        while (0 <= input || input < 4) {
            switch (input) {
                case 0:
                    break loop1;
                case 1, 2, 3:
                    System.out.printf("선택하신 메뉴는 %d입니다.", input);
                    System.out.println(
                            "    (1) square\n" +
                                    "    (2) tri\n" +
                                    "    (3) log\n" +
                                    "    원하는 메뉴(1~3)를 선택하세요. (종료 : 0)>>");
                    input = scanner.nextInt();
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.println(
                            "    (1) square\n" +
                                    "    (2) tri\n" +
                                    "    (3) log\n" +
                                    "    원하는 메뉴(1~3)를 선택하세요. (종료 : 0)>>");
                    input = scanner.nextInt();
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }
}