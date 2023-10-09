package com.green.revfile.ch5;

import java.util.Arrays;

// 오름차순, 내림차순
public class ArrayEx10 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int)(Math.random()*10));
        }
        System.out.println();
        System.out.println("----------------------------");

        int tmp = 0;
        for (int i = 1; i < numArr.length; i++) {
            for (int j = 0; j < i; j++) {
                if(numArr[i] < numArr[j]){
                    tmp = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(numArr));
    }
}
