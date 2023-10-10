package com.green.day9.ch9;
import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 100, 200 }, // 인트타입 x >> 인트배열타입
                { 300, 400 },
                { 500, 600 }
        };
        int [] intArr1 = arr[0];

        int[] newIntArr = {1, 2, 3, 4};
        // arr[0] = newIntArr; // 인트타입

        System.out.println(arr[1][1]);
        System.out.println(arr[2][0]);

        System.out.println("---------------");
        System.out.println(arr[2][1]);
        int[] intArr = arr[2];
        System.out.println(intArr[1]);

        System.out.println("---------------");
        System.out.println("arr.length : " + arr.length);
        System.out.println("arr[0].length : " + arr[0].length);
        System.out.println("---------------");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\n");
            }
        }
    }
}
