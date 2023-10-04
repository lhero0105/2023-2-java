package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5Result {
    public static void main(String[] args) {
        int score = 0;
        System.out.print("정수를 입력하세요.");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        // score 값이 90보다 같거나 크면 A학점출력
        // score 값이 80보다 같거나 크면 B학점출력
        // 1의 자리수가 8이상이면 +, 3이하이면 -, 나머지는 없음(빈칸)
        // 나머지는 C학점 출력

        // 예를 들어 98 점 > A+ 출력
        // 예를 들어 83 점 > B- 출력
        // 예를 들어 75 or 79 or 71 점 > C 출력
        String grade = "C";
        if( score >= 90 ){
            if( score >= 98 ){
                // System.out.println("A+학점");
                grade = "A+학점";
            } else if ( score > 93) {
                grade = "A학점";
            } else {
                // System.out.println("A-학점");
                grade = "A-학점";
            }
        } else if ( score >= 80 ) {
            if( score >= 88 ){
                // System.out.println("B+학점");
                grade = "B+학점";
            } else if ( score > 83) {
                grade = "B학점";
            } else {
                // System.out.println("B-학점");
                grade = "B-학점";
            }
        } else {
            // System.out.println("C학점");
            grade = "C학점";

        }
        System.out.printf("%s", grade);
    }
}
