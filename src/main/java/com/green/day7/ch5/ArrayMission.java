package com.green.day7.ch5;

public class ArrayMission {
    public static void main(String[] args) {
        int[] arr = { 100, 200, 300, 400, 500 };
        int[] arr2 = {100, 200};
        arr = arr2; // 가비지컬랙션
        // for문과 arr을 이용하여 배열의 모든 방의 값을 출력하시오
        /*
        e.g.

        100
        200
        300
        400
        500

         */
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
