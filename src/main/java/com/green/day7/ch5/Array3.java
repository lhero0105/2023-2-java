package com.green.day7.ch5;

import java.util.Arrays;

// 깊은복사
public class Array3 {
    public static void main(String[] args) {
        int[] arr1 = { 5, 10, 15, 20};
        int[] arr2 = new int[arr1.length+1]; // new 연산자로 만든 배열이기에 메모리 저장영역이 다릅니다.
        // 배열의 생성과 선언을 따로 하는 경우, new연산자 생략이 불가능합니다.
        // String 배열에서 초기화 할 때 null(주솟값이x)이 된다

        arr2 = arr1;
        System.out.println(Arrays.toString(arr2));

        String[] arr3 = new String[arr1.length];
        String[] str = arr3;
        // String str = arr3; // error

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i]; // arr이 가지고있는 공간에 값을 넣어줍니다.
        }

        // 동등성( equals ), 동일성( == )
        // 얖은복사는 동등성, 동일성 모두 true
        // 깊은복사는 동등성true, 동일성 false 일 수 있다.

        arr2[1] = 200;
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("arr1[%d]: %d\n", i, arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("arr2[%d]: %d\n", i, arr2[i]);
        } // for문 하나당 한 for문을 사용하는 것을 권장합니다. >> 나중에 매소드 사용을 위해
    }
}
