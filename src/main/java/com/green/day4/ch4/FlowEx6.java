package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args) {
        System.out.print("현재 월을 입력하세요 >>");

        Scanner scan = new Scanner(System.in);
        int mon = scan.nextInt();

        /*
        switch문으로 해결
        mon값이 3~5사이면 "현재의 계절은 봄입니다." 출력
        mon값이 6~8사이면 "현재의 계절은 여름입니다." 출력
        mon값이 9~11사이면 "현재의 계절은 가을입니다." 출력
        mon값이 12~2사이면 "현재의 계절은 겨울입니다." 출력
        */
        switch (mon){ // 문자열 비교 할 때 switch문이 좋습니다. ex) if문에서는 equal메소드를 사용하여 조건식을 적기 때문
            case 3, 4, 5: // 17버전에서 사용하능합니다. 주로 사용하는 8버전에서 사용 x
                System.out.println("현재의 계절은 봄입니다.");
                break;
            case 6 : case 7 : case 8 :
                System.out.println("현재의 계절은 여름입니다.");
                break;
            case 9 : case 10 : case 11 :
                System.out.println("현재의 계절은 가을입니다.");
                break;
            case 12 : case 1 : case 2 :
                System.out.println("현재의 계절은 겨울입니다.");
                break;
            default:
                System.out.println("없는 월 입니다.");
        }
    }
}
