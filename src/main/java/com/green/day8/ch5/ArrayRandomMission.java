package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayRandomMission {
    public static void main(String[] args) {
                /*
        5개의 방을 갖고 있는 정수형 배열을 만드시고
        각방의 1~10의 랜덤한 값을 넣어주세요
        중복x
         */
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;
            for (int j = 0; j < i; j++) {
                if (array[j] == array[i]) {
                    i--;
                    break;
                }
            }
        }
        // 출력
/*        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/
        System.out.println(Arrays.toString(array));
    }
}
