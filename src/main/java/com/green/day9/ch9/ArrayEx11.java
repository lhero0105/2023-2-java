package com.green.day9.ch9;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {
        final int LEN = 10;
        int [] numArr = new int[LEN];
        int [] cntArr = new int[LEN];
        
        /*
        numArr 각 방에 0~9 사이의 랜덤값을 대입한다(중복허용)
        cotAtt 의 1번방은 1의개수 count값을 넣는다
        
        .e.g
        [4, 4, 4, 6, 5, 7, 6, 7, 5, 3]
        1의 개수 : 0
        ...
         */
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int)(Math.random()*LEN);
        }
        System.out.println(Arrays.toString(numArr));
        System.out.println("-----------------------");

        for (int i = 0; i < numArr.length; i++) {
            cntArr[numArr[i]]++;
        }
        System.out.println(Arrays.toString(cntArr));

        for (int i = 0; i < numArr.length; i++) {
            System.out.printf("%d의 개수: %d\n", i, cntArr[i]);
        }
    }
}
