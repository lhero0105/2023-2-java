package com.green.day12.ch6;

import java.util.Arrays;

public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 6, 5, 4 };
        printArr(arr); //[3, 2, 1, 6, 5, 4]
        System.out.println(Arrays.toString(arr));  //[3, 2, 1, 6, 5, 4]
        sortArr(arr); // 같은 공간안에 있는 static

        System.out.println("sum = " + sumArr(arr));
    }

    public static void sortArr2(int[] arr){ // 오름차순
        int tmp = 0;
        for (int i = 0; i < arr.length-1; i++) { // 0 1 2 3 4 5
            for (int j = i+1; j < arr.length; j++) { // 1 2 3 4 5, 2 3 4 5, 3 4 5, ...
                if(arr[i] > arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr)); // 클래스매소드는
    }
    public static void sortArr(int[] arr){ // 오름차순 // 조건식에서 비교할 때 연산이 없어 더 좋습니다.

        int tmp = 0;
        for (int i = arr.length-1; i > 0; i--) { // 0 1 2 3 4 5
            for (int j = 0; j < i; j++) { // 1 2 3 4 5, 2 3 4 5, 3 4 5, ...
                int nIdx = j + 1;
                if(arr[j] > arr[nIdx]){
                    tmp = arr[j];
                    arr[j] = arr[nIdx];
                    arr[nIdx] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void printArr(int[] arr){
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[i];
        }
        // System.out.println(Arrays.toString(arr2));
        System.out.print("[");
        System.out.print(arr[0]);
        for (int i = 1; i < arr2.length; i++) {
            System.out.printf(", %d", arr2[i]);
        }
        System.out.print("]");
        System.out.println("지금꺼 정답");
    }

    public static int sumArr(int[] arr){
        int sum = 0;
        for (int n: arr) {
            sum += n;
        }
        return sum;
    }
}