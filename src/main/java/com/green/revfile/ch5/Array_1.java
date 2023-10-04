package com.green.revfile.ch5;
// 배열은 참조형 변수와 마찬가지로 주솟값을 변수로 가지는 참조변수를 선언하고 해당 변수에 데이터가 저장된 공간의 주소를 저장
// String클래스는 char배열에 기능(메서드)을 추가한 것이다.
public class Array_1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] tmp = new int[arr.length*2]; // arr배열길이의 *2만큼 복사하여 값을 저장합니다.
        for (int i = 0; i < args.length; i++) {
            tmp[i] = arr[i];
            arr = tmp;
        }
    }
}
