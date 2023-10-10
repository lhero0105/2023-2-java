package com.green.day9.ch9;

import java.util.Arrays;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Park", "Yi"};

        for (int i = 0; i < names.length; i++) {
            System.out.printf("names[%d]: %s\n", i, names[i]);
        }
        names[1] = "Woo"; // 쓰기
        System.out.println(Arrays.toString(names));

        int i = 0;
        for (String str: names ) { // foreach - index 전부 다 사용할 때 사용합니다. 배열 일 때
            System.out.println(str);
        }
    }
}
