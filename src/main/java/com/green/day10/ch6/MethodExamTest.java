package com.green.day10.ch6;

public class MethodExamTest {
    public static void main(String[] args) {
        MethodExam me = new MethodExam(); // 선언으로 참조타입공간마련, 해당객체초기화(생성자), 매서드 호출, 주소값 저장
        me.checkZero(10);
        me.checkZero(9);
        me.checkZero(0);

        int r = me.randomValFromTo(10, 100);
        System.out.println(r);

        for (int i = 0; i < 10000; i++) { // 검증
             r = me.randomValFromTo(10, 100);
            if (r < 10 || r > 100){
                System.out.println("잘못된 값!!!");
                break;
            }
        }

        me.scoreResultPrint(101); // 잘못된 점수입니다.
        me.scoreResultPrint(100); // A학점
        me.scoreResultPrint(90); // A학점
        me.scoreResultPrint(89); // B학점
        me.scoreResultPrint(88); // B학점
        me.scoreResultPrint(79); // C학점
        me.scoreResultPrint(69); // D학점

    }
}
