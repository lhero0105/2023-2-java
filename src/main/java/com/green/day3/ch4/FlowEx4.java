package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        int score = 0;
        System.out.print("정수를 입력하세요.");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        // score 값이 90보다 같거나 크면 A학점출력
        // score 값이 80보다 같거나 크면 B학점출력
        // score 값이 70보다 같거나 크면 C학점출력
        // 나머지는 D학점
//        if( score >= 90 ){
//            System.out.println("A학점");
//        } else if ( score > 90 && score >= 80) {
//            System.out.println("B학점");
//        } else if ( score > 80 && score >= 70) {
//            System.out.println("C학점");
//        } else {
//            System.out.println("D학점");
//        }
//        System.out.println("--끝--");

        char grade = 'D';
        if( score >= 90 ){
            grade = 'A';
        } else if ( score >= 80) {
            grade = 'B';
        } else if ( score >= 70) {
            grade = 'C';
        }
        System.out.printf("%c학점\n", grade);
        System.out.println("--끝--");
    }
}

