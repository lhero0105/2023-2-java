package com.green.day3.ch4;

import java.util.Scanner;

//int n = -10;
//        //n = n * -1;
//        n = -n; >> -1 * n 생략
public class OpreratorEx32Misson {
    public static void main(String[] args) {
        // 만약에 n이 (음수 아무값)-10이었다면 콘솔에 10이 출력
        // 만약에 n이 (양수 아무값)9이었다면 콘솔에 9가 출력
        int n = 0;

        System.out.println("n : " + n);
        if(n > 0){
            System.out.printf("%d", n);
        } else if ( n < 0 ) {
            System.out.printf("%d", (n = -n));
        } else {
            System.out.println("0을 입력하셨습니다.");
        }
        // System.out.println( n < 0 ? n : -n);
    }
}
