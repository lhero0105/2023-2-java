package com.green.day6.ch4;
// System 클래스 , out 속성 - ()가 없습니다., print() - 기능(매서드)
import java.util.Scanner;

public class FlowEx28_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1~100 사이의 정수를 입력하세요 >>");
        int num = scanner.nextInt();
        int answer = (int)(Math.random()*100) + 1; // 1~100
        System.out.println("answer : " + answer);
        /*
        while문
        1~100 사이의 정수를 입력하세요 >>

        맞출때까지 반복한다
         */


        while (true){
            System.out.println("1~100 사이의 정수를 입력하세요 >>");
            num = scanner.nextInt();
            if(num == answer){break;}
            System.out.println(num<answer ? "Up" : "Down");
        }
        System.out.println("끝!!");
    }
}
