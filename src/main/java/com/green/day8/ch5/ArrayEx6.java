package com.green.day8.ch5;

public class ArrayEx6 {
    public static void main(String[] args) {
        // score 안에서 min 값과 max값을 찾아서 출력해 주세요
        int[] score = { 79, 88, 91, 33, 100, 55, 95 };
        int min = score[1];
        int max = score[5];

        // Case 1
        for (int i = 0; i < score.length; i++) {
            if(min > score[i]){
                min = score[i];
            }
            else if(max < score[i]){
                max = score[i];
            }
        }
        System.out.printf("max : %d, min : %d\n", max, min);
        System.out.println("-----------------------------------");

        // Case 2
        for (int i = 0; i < score.length; i++) {
            min = score[i] < min ? score[i] : min;
            max = score[i] > max ? score[i] : max;
        }
        System.out.printf("max : %d, min : %d", max, min);
    }
}