package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayToStringMission {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 7, 3, 5, 8, 10, 500 };
        System.out.println(Arrays.toString(arr));
        //for문을 활용하여 콘솔에 [5, 10, 7, 3] 출력되도록 하시오.
        System.out.println("----------------------------");

        // Case 1 (더티코딩)
        int commaLen = arr.length - 1;
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) { // for(조건식안에 연산이 들어간다면 프로세스가 많이 잡아먹힙니다.)
            if(i< commaLen){
                System.out.print(arr[i] + ", ");
            }else {
                System.out.print(arr[i]);
            }
        }
        System.out.print("]\n");
        System.out.println("----------------------------");

        // Case 2 (case1 삼항식)
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) { // for(조건식안에 연산이 들어간다면 프로세스가 많이 잡아먹힙니다.)
            System.out.print(i < commaLen ? (arr[i] + ", ") : (arr[i]) );
        }
        System.out.print("]\n");
        System.out.println("----------------------------");

        // Case 3
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != commaLen) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
        System.out.println("----------------------------");

        // Case 4 (연산을 안해도 되기에 더 NICE한 코딩이 됩니다.)
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i != 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.print("]\n");
        System.out.println("----------------------------");
        // Case 5 (연산과 분기문 모두 안들어간 가장 NICE한 코드입니다.)
        System.out.printf("[%d", arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.printf(", %d", arr[i]);
        }
        System.out.print("]");
    }
}