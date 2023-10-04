package com.green.day4.ch4;

public class RandomVal {
    public static void main(String[] args) {
        double doubleVal = Math.random(); // 0.000.. ~ 0.999..
        System.out.println("doubleVal : " + doubleVal);
        int intVal = (int)(doubleVal * 10); // 큰값이 작은 값으로 들어 갈 떄 문제의 소지가 있기에 컴퓨터가 자동형변환하지 않습니다.
        // int intVal = (int)doubleVal * 10; x 실수값이 날아갑니다
        System.out.println("intVal : " + intVal);

        int rVal = (int)(Math.random() * 20);
        System.out.println("rVal = " + rVal);
    }
}
