package com.green.day9.ch9;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx16 {
    public static void main(String[] args) {
        /*
        3개의 String 값을 담을 수 있는 배열을 생성.
        3번 문자열로 입력을 받는다. (Scanner 이용)

        입력받은 문자열들을 순차적으로 배열에 값을 넣는다.
        값 넣는게 종료가 되면 향상된 for문을 이용하여
        저장되어있는 값들을 콘솔에 출력한다.
         */
        String[] strArr = new String[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < strArr.length; i++) {
            System.out.print("문자열을 입력해주세요 >>");
            String val = scanner.nextLine();
            strArr[i] = val;
        }
        System.out.print("[");
        for (String strE : strArr) {
            System.out.print(strE);
            System.out.print(", ");
        }
        System.out.print("]");
        System.out.println();
        System.out.println(Arrays.toString(strArr));
    }
}