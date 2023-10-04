package com.green.revfile.ch5;

public class Ch5_Ex3 {
    public static void main(String[] args) {
        int []arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        } // 배열에 1~5숫자를 저장한다
        System.out.println("변경전");
        System.out.println("arr.length = " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"]:"+arr[i]);
        }
        int [] tmp = new int[arr.length*2];

        for (int i = 0; i < arr.length; i++) { // 배열 arr에 저장된 값들을 tmp에 복사합니다.
            tmp[i] = arr[i];
        } // tmp = {1,2,3,4,5,0,0,0,0,0}
        arr = tmp; // tmp에 저장된 값을 arr에 저장합니다.
        System.out.println("변경후");
        System.out.println("arr.length:" + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"]:"+arr[i]);
        }
    }
}
