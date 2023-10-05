package com.green.day7.ch4;

public class FlowEx31 {
    public static void main(String[] args) {
        // 0~10까지 반복(11번)
        // 3의 배수는 (0포함) 출력이 안되로록 해주세요
        /*
        1
        2
        4
        5
        7
        10
         */
        for (int i = 1; i < 11; i++) {
            if(i%3 == 0){ continue; }
            System.out.println(i);
        }
    }
}
