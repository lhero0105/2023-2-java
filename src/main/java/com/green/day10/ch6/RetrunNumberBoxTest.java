package com.green.day10.ch6;

public class RetrunNumberBoxTest {
    public static void main(String[] args) {
        ReturnNumberBox rnb = new ReturnNumberBox(); // ReturnNumberBox의 객체의 주솟값을 담을 수 있는 변수 선언

        rnb.sum(10,20);
        int r1 = rnb.sum(10,20); // return 값인 30이 호출된 매서드로 반환되어 r1 = 30이 됩니다..
        System.out.println("r1 : " + r1);
        System.out.println("-- 끝 --");
        // return타입과 매게변수로 받는 인수의 타입이 같아야합니다.

        int r3 = rnb.abs(-10);
        System.out.println("r3 : " + r3); // 10

        System.out.println("r4 : " + rnb.abs(10)); // 10
        System.out.println("r4 : " + rnb.abs(-99)); // 99
        System.out.println("r4 : " + rnb.abs(98)); // 98
    }
}
