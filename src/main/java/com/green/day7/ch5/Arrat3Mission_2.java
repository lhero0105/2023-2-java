package com.green.day7.ch5;

public class Arrat3Mission_2 {
    public static void main(String[] args) {
        int[] arr1 = { 5, 10, 15 };
        int[] arr2 = new int[arr1.length+1];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        arr2[arr1.length] = 20;

        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("arr2[%d]: %d\n", i, arr2[i]);
        }
    }
}
