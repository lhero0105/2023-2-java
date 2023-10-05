package com.green.day6.ch4;

import java.util.Scanner;
// while 조건문만 사용 할 때 ex) ++쓸 때 for문 사용 권장
// 내가 구하고자 하는 값의 조건이 무엇인지 정확히 모를 경우, 유동적인 경우
public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("1~100사이의 숫자 입력 (종료:0) >> ");
        int input = scanner.nextInt();
        while (input !=0){
            System.out.println("1~100사이의 숫자 입력 (종료:0) >> ");
            input = scanner.nextInt();
            sum += input;
        }
        System.out.println("끝!!" + sum);
    }
}
