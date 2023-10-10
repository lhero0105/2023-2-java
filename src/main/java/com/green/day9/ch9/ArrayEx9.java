package com.green.day9.ch9;

import java.util.Arrays;

public class ArrayEx9 {
    public static void main(String[] args) {
        int[] code = { -4, -1, 3, 6, 11};
        int[] arr = new int[10];
        /*
        srr 각방에 code에 있는 값만 랜덤하게 넣어주세요
         */
        for (int i = 0; i < arr.length; i++) {
            int rIdx = (int)(Math.random()*code.length);
            arr[i] = code[rIdx];
        }
        System.out.println(Arrays.toString(arr));
    }
}
