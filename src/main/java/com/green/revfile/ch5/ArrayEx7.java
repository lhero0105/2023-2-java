package com.green.revfile.ch5;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        // 1. 정수 10개를 저장할 수 있는 배열을 만든다.
        // 2. 0~9 값을 순차적으로 대입한다.
        // 3. 셔플
        int[] num = new int[10];
        int tmp = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = i;
        } // [ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 ]
        for (int i = 0; i < num.length; i++) {
            int r = (int) (Math.random() * 10);
            tmp = num[i];
            num[i] = num[r];
            num[r] = tmp;
        }
        System.out.println(Arrays.toString(num));
    }
}
