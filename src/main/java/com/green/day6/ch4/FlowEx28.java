package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1~100 사이의 정수를 입력하세요 >>");
        int num = scanner.nextInt();
        int input = 0;
        int answer = (int)(Math.random()*100) + 1; // 1~100
        System.out.println("answer : " + answer);
        /*
        while문
        1~100 사이의 정수를 입력하세요 >>

        맞출때까지 반복한다
         */


        boolean a = true;
        while (num != 0){
            if(answer<num){
                System.out.printf("%d보다 작습니다.",num);
                System.out.println("1~100 사이의 정수를 입력하세요 >>");
                num = scanner.nextInt();
            }else if(answer>num){
                System.out.printf("%d보다 큽니다.",num);
                System.out.println("1~100 사이의 정수를 입력하세요 >>");
                num = scanner.nextInt();
            }else{
                break;
            }
        }
        System.out.println("끝!!");
    }
}
