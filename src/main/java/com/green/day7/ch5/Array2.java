package com.green.day7.ch5;
// 얕은복사
// 래퍼런스 변수에서의 "==" 주솟값이 같다
//깊은 복사(Deep Copy)**는 '실제 값'을 새로운 메모리 공간에 복사하는 것을 의미하며,
//얕은 복사(Shallow Copy)**는 '주소 값'을 복사한다는 의미입니다.
public class Array2 {
    public static void main(String[] args) {
        int[] arr1 = {100, 200};
        int[] arr2 = {5, 10 ,15};

        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("arr1[%d]: %d\n", i, arr1[i]);
        }


        arr1 = arr2; // arr1에 arr2의 주솟값을 복사(얕은복사.sallowcopy)해서 저장합니다.
        System.out.println("----------");

        arr1[1] = 44;
        arr1[2] = 55;

        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("arr1[%d]: %d\n", i, arr1[i]);
        }
    }
}
