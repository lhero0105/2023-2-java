package com.green.revfile.ch5;

import java.util.Arrays;

public class ArrayEx8 {
    public static void main(String[] args) {
        int ballLength = 45;
        int[] ball = new int[ballLength];

        for (int i = 0; i < ball.length; i++) {
            ball[i] = i+1;
        }
        int tmp = 0;
        // 배열의 1번쨰 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
        // 0번째 부터 5번째 요소까지 모두 6개만 바꾼다.
        for (int i = 0; i < 6; i++) {
            int ran = (int)(Math.random()*45);
            tmp = ball[i];
            ball[i] = ball[ran];
            ball[ran] = tmp;
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(ball[i]+ " ");
        }
    }
}
