package com.green.day1.ch1;

public class VarEx2 {
    public static void main(String[] args){
        int x = 10, y = 20;
        // 10 값을 씁니다.
        // 10을 리터럴이라 부릅니다.
        // 스와핑
        int temp = x;
        // x 값을 복사하여 대입해둡니다.
        x = y;
        // y값을 읽습니다.
        y = temp;
        System.out.printf("x : " + x);
        System.out.printf("y : " + y);
        // 타입이 다르면 연산을 할 수 없기에 자동형변환을 합니다.
        // 빨간줄이 뜰 때 강제형변환을 해줍니다.
    }
}
