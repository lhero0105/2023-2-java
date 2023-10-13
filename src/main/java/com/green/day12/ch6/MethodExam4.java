package com.green.day12.ch6;

import java.util.Arrays;

public class MethodExam4 {
    // 깊은복사
    int[] plusMap(int[] n1, int n2){
        int[] tmp = new int[n1.length];
        for (int i = 0; i < n1.length; i++) {
           tmp[i] = n1[i] + n2;
        }
        return tmp;
    }
    // 얖은복사 1
    int[] plusOrigin(int[] n1, int n2){
        for (int i = 0; i < n1.length; i++) {
            n1[i] += n2;
        }
        return n1;
    }
    // 얕은복사 2
    int[] plusOrigin2(int[] n1, int n2){
        int[] tmp = new int[n1.length];
        for (int i = 0; i < n1.length; i++) {
            tmp[i] = n1[i] + n2;
            n1[i] = tmp[i];
        }
        return n1;
    }

    int[] randomValFromTo(int arrL, int min, int max){
        int[] arr = new int[arrL];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*(max-min+1)+min);
        }
        return arr;
    }
    public static void main(String[] args) {
        MethodExam4 me4 = new MethodExam4();

        int[] arr = {10, 20, 30, 40, 50};
        int[] rArr1 = me4.plusMap(arr, 2); // map - 똑같은 크기의 새로운 배열생성하여 리턴
        System.out.println(Arrays.toString(rArr1));
        // 비파괴 매소드 - 원본은 훼손 되지 않은 채로

        me4.plusOrigin(arr, 2);
        me4.plusOrigin2(arr, 2);
        System.out.println(Arrays.toString(arr));// [14, 24, 34..]

                        // 배열크기, 랜덤 min값, 랜덤 max값, 중복 허용
        int[] rArr2 = me4.randomValFromTo(10, 5, 20);
        System.out.println(Arrays.toString(rArr2));
    }
}
