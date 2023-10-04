package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args) {
        int score = 0;
        char grade = 'F';

        System.out.print("당신의 점수를 입력하세요.(1~100) >>");
        Scanner scan = new Scanner(System.in);
        String tmp = scan.nextLine();
        score = Integer.parseInt(tmp);
        // 스위치 이용
        // 90점 이상은 "당신의 학점은A입니다."
        // 80점 이상은 "당신의 학점은B입니다."
        // 70점 이상은 "당신의 학점은C입니다."
        // 나머지는 " 당신의 학점은 D입니다."
        //char ct = tmp.charAt(0);

        char num = 'c';
        if (score < 0 || score > 100) {
            System.out.println("잘못된 입력 입니다.");
        } else {//(int)(score*0.1)
            switch (score / 10) { // 문제해결능력..
                case 9, 10:
                    //System.out.println("당신의 학점은A입니다.");
                    num = 'A';
                    break;
                case 8:
                    //System.out.println("당신의 학점은B입니다.");
                    num = 'B';
                    break;
                case 7:
                    //System.out.println("당신의 학점은C입니다.");
                    num = 'C';
                    break;
                default:
                    num = 'F';
            }
            System.out.printf("당신의 학점은%c입니다", num);
        }
    }
}
