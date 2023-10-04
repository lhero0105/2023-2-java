package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args) {
        System.out.print("당신의 주민번호를 입력하세요.(011231-1111222) >>>");

        // 주민번호 입력받으시고,
        // 주민번호를 환인하시고 > 여자인지 남자인지, 유효하지않은 주민등록번호인지 출력
        // 남자 13 여자 24
        // switch문 이용
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        char result = num.charAt(7);

        switch (result){
            case '1' : case '3' :
                System.out.println("남자");
                break;
            case '2', '4' :
                System.out.println("여자");
                break;
            default:
                System.out.println("유효하지 않은 주민번호입니다.");
                break;
        } // switch문에서 조건식으로 실수, 불린 타입(ex- a < b), 참조형 타입은 사용불가

        // double a = 0.001;
        // switch (a){} //error
        // boolean b = false;
        // switch (b){} //error
    }
}
