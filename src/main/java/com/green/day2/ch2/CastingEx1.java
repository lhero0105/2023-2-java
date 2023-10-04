package com.green.day2.ch2;
// (타입)피연산자 - ()는 "캐스트 연산자" 또는 "형변환 연산자" 라고 합니다.
// 기본형과 참조형은 서로 형변환 할 수 없다. boolean을 제외한 7개 기본형은 서로 형변환이 가능하다.
public class CastingEx1 {
    public static void main(String[] args) {
        float d = 85.4f;
        int score = (int)d;
        System.out.printf("score : " + score);
        System.out.printf("d : " + d);
        // d 값은 변하지 않고 복사해서 가져오기 떄문입니다.
        byte b1 = 127;
        short s1 = b1; // 작은 값을 큰 값에 담을 때 자동형변환
        int i1 = s1;

        float f1 = i1; // 지수표현으로 많은 값을 저장할 수 있기에 같은 4바이트라도 int를 저장할 수 있습니다.
        int i2 = (int)f1;
        // 실수는 정수에 담지 못합니다.
    }
}
