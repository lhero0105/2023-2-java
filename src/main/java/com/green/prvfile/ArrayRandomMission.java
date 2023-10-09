package com.green.prvfile;

import java.util.Arrays;

public class ArrayRandomMission {
    public static void main(String[] args) {
        /*
        5개의 방을 갖고 있는 정수형 배열을 만드시고
        각방의 1~10의 랜덤한 값을 넣어주세요
        중복x
        */
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random()*10)+1;
            for (int j = 0; j < i; j++) {
                if(num[i] == num[j]){
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
