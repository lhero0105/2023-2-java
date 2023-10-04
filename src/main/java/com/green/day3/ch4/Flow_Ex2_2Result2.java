package com.green.day3.ch4;

import java.util.Scanner;

public class Flow_Ex2_2Result2 {
    public static void main(String[] args) {
        System.out.println("숫자를 하나 입력하세요 >");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        int val = Integer.parseInt(tmp);

        if ( val == 0 ){
            System.out.println("다른 값을 입력해 주세요.");
        } else {
            System.out.printf("%d는(은) %c수 입니다."
                    , val
                    , (val % 2 == 0 ? '짝' : '홀') );// 가독성을 위해 ()를 묶어 주었습니다.
        }
    }
}
