package com.green.revfile.ch5;

import java.util.Arrays;
// 배열에 무작위 정수를 넣어 그 정수가 몇 번 나왔는지 출력하는 예제
// 실행결과
/*
.e.g
0의 개수 : 0개
1의 개수 : 2개
...
9의 개수 : 1개

힌트 - []++
 */
public class ArrayEx11 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] counter = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int)(Math.random()*10);
        }
        System.out.println(Arrays.toString(numArr));

        for (int i = 0; i < numArr.length; i++) {
            counter[numArr[i]]++; // 핵심
        }
        System.out.println(Arrays.toString(counter));
        for (int i = 0; i < numArr.length; i++) {
            System.out.printf("%d의 자리 : %d개\n", i+1, counter[i]);
        }
    }
}
