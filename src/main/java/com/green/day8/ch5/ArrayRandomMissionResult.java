package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayRandomMissionResult {
    public static void main(String[] args) {
                /*
        5개의 방을 갖고 있는 정수형 배열을 만드시고
        각방의 1~10의 랜덤한 값을 넣어주세요
         */
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 5) + 1;
            for (int z=0; z<i; z++){
                if(arr[i] == arr[z]){
                    i--;
                    break; // 비교할 필요 없는데 또 비교합니다.
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
