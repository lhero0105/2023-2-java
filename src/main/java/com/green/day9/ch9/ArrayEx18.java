package com.green.day9.ch9;

import java.util.Arrays;

public class ArrayEx18 {
        /*
        score[0][0] = 101
        score[0][1] = 102
        score[0][2] = 103
        ...
        score[3][2] = 43
        sum = ??
         */
    public static void main(String[] args) {
        int[][] score = {
                {101, 102, 103},
                {21, 22, 23},
                {31, 32, 33},
                {41, 42, 43}
        };
        int sum = 0;

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                int val = score[i][j];
                System.out.printf("score[%d][%d] = %d\n", i, j, val);
                sum += score[i][j];
            }
        }
        System.out.printf("sum = %d", sum);

        // 향상된 for문을 이용하여 sum 값을 구하고 싶다.
        for (int[] arr: score) { // 배열 타입
            for ( int val: arr) { // 정수 타입
                sum += val;
            }
        }
        System.out.println();
        System.out.printf("sum = %d", sum);
    }
}
