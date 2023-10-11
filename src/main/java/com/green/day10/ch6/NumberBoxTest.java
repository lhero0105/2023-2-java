package com.green.day10.ch6;

public class NumberBoxTest {
    public static void main(String[] args) {
        NumberBox nb1 = new NumberBox(); // NumberBox() - 생성자(인스턴스 초기화)
        // NumberBox nb1 - 참조형타입인 변수를 만들어 메모리 공간을 확보합니다.
        // = - 저장
        // new NumberBox() - new연산자로 객체를 생성하며 NumberBox() 객체를 호출합니다.
        // 원시타입의 객체 주솟값을 NumberBox 에 저장하지 못합니다.

        nb1.sum(10, 20); // 매소드 호출 > 값이 복사가 되어 n1에 들어갑니다
        nb1.sum(30, 40);
        // 매소드를 정의하는 이유는 재사용성과 코드중복제거를 위함 입니다.

        nb1.minus(40, 20);

        nb1.abs(-10); // 10
        nb1.abs(10); // 10
        nb1.abs(-33); // 33
        nb1.abs(39); // 39
    }
}
