package com.green.prvfile;

import java.util.Arrays;

public class MethodExam4 {
    // 깊은복사
    static int[] plusMap(int[] arr, int n){
        int[] tmpArr = new int[arr.length];
        for (int i = 0; i < tmpArr.length; i++) {
            tmpArr[i] = arr[i]+n;
        }
        return tmpArr;
    }
    // 얖은복사
    static int[] plusOrigin(int[] arr, int n){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] += n;
        }
        return arr;
    }

    static int[] randomValFromTo(int arrLen, int min, int max){
        int[] arr = new int[arrLen];
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
        //me4.plusOrigin2(arr, 2);
        System.out.println(Arrays.toString(arr));// [14, 24, 34..]

                        // 배열크기, 랜덤 min값, 랜덤 max값, 중복 허용
        int[] rArr2 = me4.randomValFromTo(10, 5, 20);
        System.out.println(Arrays.toString(rArr2));
    }
}
