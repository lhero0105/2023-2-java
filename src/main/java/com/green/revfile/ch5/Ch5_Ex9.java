package com.green.revfile.ch5;

import java.util.Arrays;

public class Ch5_Ex9 {
    public static void main(String[] args) {
        int[] code = { -4, -1, 3, 6, 11 };
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int tmp = (int)(Math.random() * 5);
            arr[i] = code[tmp];
        }
        System.out.println(Arrays.toString(arr));
    }
}
