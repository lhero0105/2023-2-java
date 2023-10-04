package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx25_Array {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.print("숫자를 입력하세요.(예:12345) >> ");

        //12345 >> 15
        //2233 >> 10
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] arr = input.toCharArray(); // ex) [1,2,3]
        for (int i = 0; i < arr.length; i++) {
            sum += Character.getNumericValue(arr[i]); // 배열 값을 가져와 char형을 정수형으로 만듭니다.
        }
        System.out.println("결과 : " + sum);
    }
}
