package com.green.extra.day1;

public class Casting {
    public static void main(String[] args) {
        int n1 = 10, n2 = 3;
        // n1 / n2 >>> 3.333
        float n = (float)n1/n2;
        System.out.printf("%1.3f",n);

        long l1 = 10000L; //8비트
        float f2 = l1; // 4비트
        // 비트맵(일반 이미지), 백터 (아무리 확대해도 깨지지 않습니다/)

    }
}
