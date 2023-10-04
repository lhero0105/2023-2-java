package com.green.day4.ch4;

import java.util.Scanner;

public class If_1 {
    public static void main(String[] args) {
        // Scanner를 이용하여 성별을 입력(남자, 여자)
        // 만약에 남자가 입력되었다면 콘솔에 "잘 생겼다." 출력
        // 만약에 여자가 입력되었다면 콘솔에 "예쁘다." 출력
        // 만약에 남자여자가 아니라면 "누구나" 출력
        Scanner scanner = new Scanner(System.in);
        String gen = scanner.nextLine();

/*        // Case 1
        if( "남자".equals(gen) ){
            System.out.println("잘 생겼다");
        } else if ( "여자".equals(gen) ){
            System.out.println("예쁘다");
        } else {
            System.out.println("누구나");
        }

        // Case 1.5
        String m = "잘 생겼다";
        String w = "예쁘다";
        System.out.printf("%s", "남자".equals(gen) ? m : w );*/

        // Case 2
        String o = "누구나";
        String m = "잘 생겼다";
        String w = "예쁘다";
        System.out.printf("%s","남자".equals(gen) || "여자".equals(gen)
                ? ("남자".equals(gen) ? m : w )
                : o );
        System.out.println();
    }
}
