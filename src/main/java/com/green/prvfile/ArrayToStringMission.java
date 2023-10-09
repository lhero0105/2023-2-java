package com.green.prvfile;

import java.util.Arrays;

public class ArrayToStringMission {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 7, 3, 5, 8, 10, 500 };
        System.out.println(Arrays.toString(arr));
        //for문을 활용하여 콘솔에 [5, 10, 7, 3] 출력되도록 하시오.
        System.out.println("----------------------------");

        int len = arr.length-1;
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if( i == len) {continue;}
                System.out.print(", ");
        }
        System.out.println("]");
        System.out.println("----------------------------");

        System.out.print("[");
        System.out.printf("%d",arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.print(", ");
            System.out.printf("%d", arr[i]);
        }
        System.out.println("]");
    }
}