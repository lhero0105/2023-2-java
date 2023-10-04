package com.green.day2.ch2;

public class StringEx {
    public static void main(String[] args){
        String name = "ja" + "va";
        // 문자열 합치기
        System.out.printf(name);

        System.out.println("ja" + "va");

        System.out.println("12" + 10 + 9);
        // 실행순서 "12" 와 10 을 먼저 계산
        // 타입이 달라 자동형변환을 하는데 String 이 강하여 결과가 "12" + "10"
        // "12" + 10
        // "12" + "10" > "1210"
        // "1210" + 9
        // "1210+ + 9 > "12109"
        System.out.println("12" + (10 + 9));
        // 10 + 9 > 19
        // "12" + 19
        // "12" + "19" > "1219"
    }
}
