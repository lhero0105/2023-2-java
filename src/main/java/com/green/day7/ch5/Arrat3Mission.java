package com.green.day7.ch5;

public class Arrat3Mission {
    public static void main(String[] args) {
        int[] arr1 = { 5, 10, 15 }; // 크기를 변경 할 수 없습니다. 각 방은 4바이트라 점점 커지지만, 주솟값은 (64비트)8바이트입니다.

        // arr2는 길이가 4구요, arr1과 같은 방은 값은 값을 가지고있고
        // 3번 방은 20번을 갖고 있는 배열을 만들어 주세요
        int[] arr2 = new int[arr1.length+1];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.print("[");
        for (int i = 0; i < arr2.length; i++) {
            if(i == arr1.length){
                arr2[i]= 20;
            }
            System.out.print(arr2[i]+", ");
        }
        System.out.print("]");
    }
}
