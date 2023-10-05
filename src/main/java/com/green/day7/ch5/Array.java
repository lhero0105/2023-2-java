package com.green.day7.ch5;
// 배열은 여러개의 값을 담을 수 있느 공간이며, 레퍼런스타입 입니다.
// 변수에는 값을 하나밖에 저장 할 수 없습니다. >> 주솟값을 말합니다.
// JVM의 Heap 영역에서 동적으로 할당했던 메모리 영역 중 필요 없게 된 메모리 영역을 주기적으로 삭제하는 프로세스
public class Array {
    public static void main(String[] args) {
        int[] a; // a에 저장되는 값은 오로지 주솟값 입니다.
        int[] arr = { 10, 20, 30 };
        System.out.println("arr[0]: " + arr[0]); // 읽기
        System.out.println("arr[1]: " + arr[1]);
        System.out.println("arr[2]: " + arr[2]);
        // System.out.println("arr[3]: " + arr[3]); // error - ArrayIndexOutOfBoundsException
        arr[0] = 200;
        System.out.println(arr[0]);
        System.out.println(arr.length);

        String[] arr2 = {"10", "20", "30"};
        // String arr2[] = {"10", "20", "30"};
        String[] arr3 = new String[10]; // 각 방에는 null으로 초기화 됩니다.
        int[] arr4 = new int[10]; // 각 방에는 0으로 초기화 됩니다.

    }
}
