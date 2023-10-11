package com.green.day10.ch6;

public class MethodExamTest {
    public static void main(String[] args) {
        MethodExam me = new MethodExam(); // 선언으로 참조타입공간마련, 해당객체초기화(생성자), 매서드 호출, 주소값 저장
        me.checkZero(10);
        me.checkZero(9);
        me.checkZero(0);

        int r = me.randomValFromTo(10,100);
        System.out.println(r);
    }
}
