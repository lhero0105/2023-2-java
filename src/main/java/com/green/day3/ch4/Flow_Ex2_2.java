package com.green.day3.ch4;

import java.util.Scanner;

//Scanner
//if
//parsing
// 실행결과
// 숫자를 하나 입력하세요 >
// (입력을 기다려야 함)
// 숫자가 입력하고 엔터를 누르면
// String 변수에 해당값이 저장될 수 있도록
// 해당 문자열 > 정수형으로 형변환
// 해당 숫자가 0이라면 콘솔에 " 입력하신 숫자는 0입니다."
// 해당 숫자가 0이 아니라면 콘솔에 "입력하신 숫자는 0이 아닙니다."
public class Flow_Ex2_2 {
    public static void main(String[] args) {
        System.out.println("숫자를 하나 입력하세요 >");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        int input = Integer.parseInt(tmp);

        if ( input == 0){
            System.out.println("입력하신 숫자는 0입니다.");
        } else {
            System.out.printf("입력하신 숫자는 %d이 입니다.", input);
        }

    }
}
