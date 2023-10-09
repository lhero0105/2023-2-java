package com.green.revfile.ch5;

import java.util.Arrays;
// code 안에 담긴 값들을 더 큰배열에 무작위로 넣는 예제
public class ArrayEx9 {
    public static void main(String[] args) {
        int[] code = { -4, -1, 3, 6, 11 };
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            int ran = (int)(Math.random()* code.length);
            arr[i] = code[ran];
        }
        System.out.println(Arrays.toString(arr));
    }
}
