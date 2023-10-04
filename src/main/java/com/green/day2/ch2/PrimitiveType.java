package com.green.day2.ch2;
// insert - 수정모드, 삽입모드
public class PrimitiveType {
    public static void main(String[] args) {
        // 논리형
        boolean test = true, test2 = false;

        // 문자형
        char ch1 = 'a', ch2 = '가';

        // 정수형 - 예전에는 용량이 작았기에 자연스래 생겨났습니다.
        byte b1 = 1 ; // 1 byte // -128 ~ 127
        short s1 = 10 ; // 2 byte // -32,768 ~ 32,767
        int i1 = 100 ; // 4 byte // 2,147,483,648 ~ 2,147,483,647
        long l1 = 1000 ; // 8 byte // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        // int i1 = (int)100L

        // 1bit
        // 8bit > 1byte
        // 1024byte > 1Kb
        // 1024kb > 1Mb
        // 1024Mb > 1Gb
        // 1024Gb > 1Tb

        // 실수형
        float f1 = 10.1f;
        // 방법 1 - 10.1 은 더블타입 입니다. 리터럴 자체를 float 타입으로 한다 > 뒤에 f, F
        float f4 = (float) 10.4;
        // 방법 2 - 강제형변환( 연산을 한번 거쳐 복사되어 들어갑니다 )
        double d1 = 10.1, d2 = 10.1d, d3 = 10.1D;
        float f5 = (float) d1;
        // 변수명 읽기를 할 때 f를 적을 수 없기에 강제형변환 이용
    }
}
