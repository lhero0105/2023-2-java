package com.green.day7.ch5;

public class Arrat3Mission {
    public static void main(String[] args) {
        int[] arr1 = { 5, 10, 15 };

        // arr2는 길이가 4구요, arr1과 같은 방은 값은 값을 가지고있고
        // 3번 방은 20번을 갖고 있는 배열을 만들어 주세요
        int[] arr2 = new int[4];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
            if(i == arr1.length-1) {
                arr2[i] = 20;
            }
        }
        System.out.print("[");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+", ");
        }
        System.out.print("]");
    }
}
