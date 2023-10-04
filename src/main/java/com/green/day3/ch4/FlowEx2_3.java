package com.green.day3.ch4;

import java.util.Scanner;

// 실행결과
// 숫자를 하나 입력하세요 >
// (입력을 기다려야 함)
// 숫자가 입력하고 엔터를 누르면
// String 변수에 해당값이 저장될 수 있도록
// 해당값이 홀수면
// 00은 홀수 입니다.
// 해당값이 짝수면
// 00은 짝수입니다.

// 예를 입력을 8로했다
// 8은 짝수입니다.
// 입력을 17로 했다.
// 17은 홀수입니다.
public class FlowEx2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 하나 입력하세요 >");

        String tmp = scanner.nextLine();
        // String tmp = scanner.nextInt();
        // 편하지만 숫자가 아닌 값을 입력 시 error가 떠서 프로그램이 멈춥니다.
        int input = Integer.parseInt(tmp);

        if ( input % 2 == 0 ) {
            System.out.printf("%d은 짝수 입니다.", input);
        } else if ( input % 3 == 0 ) {
            System.out.printf("%d은 홀수 입니다.", input);
        }
    }
}
