package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        /*
        5개의 방을 갖고 있는 정수형 배열을 만드시고
        각방의 1~10의 랜덤한 값을 넣어주세요
        중복허용
         */
        final int LEN = 5; // 매직넘버
        int[] array = new int[LEN];
        for (int i = 0; i < array.length; i++) {
            int random = (int)(Math.random()*10) + 1;
            array[i] = random;
        } // 읽기 / 쓰기 작업을 따로 합니다.
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println(array);
        System.out.println(array.toString());// 배열을 String으로 바꿔줍니다.
        System.out.println(Arrays.toString(array)); // api 에서 Arrays가 자동적으로 반복문을 만들어 배열을 찍습니다.
    }
}
