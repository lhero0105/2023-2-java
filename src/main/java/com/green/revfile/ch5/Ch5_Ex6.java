package com.green.revfile.ch5;

public class Ch5_Ex6 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95};
        int max = score[0]; //첫번 째 값으로 초기화
        int min = score[0]; //첫번 째 값으로 초기화

        for (int i = 0; i < score.length; i++) {
            if(score[i] > max){
                max = score[i]; // 높은 값으로 재선언이 반복되는 형식
            } else if (score[i]<min) {
                min = score[i];
            }
        }
        System.out.println("최대값 :" + max);
        System.out.println("최소값 :" + min);
    }
}
