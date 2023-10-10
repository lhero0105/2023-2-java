package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        // 1. 정수 10개를 저장할 수 있는 배열을 만든다.
        // 2. 0~9 값을 순차적으로 대입한다.
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = i;
        }
        System.out.println(Arrays.toString(num));

        int tmp = 0;
        for (int i = 0; i < num.length; i++) {
            int rIdx = (int)(Math.random()*10); //0~9
            if(i == rIdx) {continue;}
            tmp = num[i];
            num[i] = num[rIdx];
            num[rIdx] = tmp;
        }
        System.out.println(Arrays.toString(num));


    }
}
