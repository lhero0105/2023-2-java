package com.green.day8.ch5;

public class ArrayEx5 {
    public static void main(String[] args) {
        int[] score = { 100, 88, 100, 100, 90 }; // 누군가의 점수
        int sum = 0;
        double average = 0;
        // 총점
        // 평균점수
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
            average = (double)sum / score.length;
        }
        System.out.printf("sum = %d\n", sum);
        System.out.printf("average = %f", average);
    }
}
