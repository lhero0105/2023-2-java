package com.green.revfile.ch5;
// 배열은 참조형 변수와 마찬가지로 주솟값을 변수로 가지는 참조변수를 선언하고 해당 변수에 데이터가 저장된 공간의 주소를 저장
public class Ch5_Ex11_S {
    public static void main(String[] args) {
/*        int[] numArr = new int[10];
        int[] counter = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int)(Math.random()*10); // ex) 1299235560
            System.out.print(numArr[i]);
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            counter[numArr[i]]++; //i = 2 > counter[9]++ > {0,0,0,0,0,0,0,0,0,1}
        }
        for (int i = 0; i < numArr.length; i++) {
            System.out.println( i + "의 개수 :" + counter[i]);
        }*/

        int[] numArr = new int[10];
        int[] counter = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random()*10);
            System.out.print(numArr[i]);
        }
        System.out.println();
        for (int i = 0; i < counter.length; i++) {
            counter[numArr[i]]++; // 핵심
        }
        for (int i = 0; i < counter.length; i++) {
            System.out.print(counter[i]);
        }
        System.out.println();
        for (int i = 0; i < numArr.length; i++) {
            System.out.println(i + " 의 개수 :" + counter[i]);
        }
    }
}