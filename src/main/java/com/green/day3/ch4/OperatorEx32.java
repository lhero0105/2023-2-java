package com.green.day3.ch4;

public class OperatorEx32 {
    public static void main(String[] args) {
        // 조건식 ? true 였을 때 : false 였을 떄;
        int n1 = 10, n2 = 20;

        int r = n1 > n2 ? n1 : n2; // 조건에 따라 복사되어 들어갑니다.
        System.out.println("r : " + r);
    }
}
