package com.green.revfile;

import java.util.Map;
import java.util.Scanner;

// go / stop : go
// 현재등급 : 2
// go / stop : go
// 현재등급 : 1
// go / stop : go
// 현재등급 : 0
// go / stop : go
// 현재등급 : -1
// 실패
// 스캐너를 사용하여 go 일 때 저장해줍니다.
public class RandomEnforce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = 1;
        System.out.printf("현재 강화등급 : %d\ngo / stop : \n",grade);
        String input = scanner.nextLine();
        int min = 1, max = 10; // 1~10

        Loop1 : while ( 0 < grade && grade < 10){
            switch (input) {
                case "go" :
                    int random = (int) (Math.random()*(max-min+1))+min;
                    System.out.printf("현재 강화등급 : %d\n", (random > 2) ? ++grade : --grade ); // ex) random > 4 60%확률
                    if(0 < grade && grade < 10){
                        System.out.println("go / stop :");
                        input = scanner.nextLine();
                        break ;
                    }else{
                        break Loop1;
                    }

                case "stop" :
                    System.out.printf("현재 강화등급 : %d", grade);
                    break Loop1;
                default:
                    System.out.println("잘못 입력하셨습니다. go / stop :");
                    input = scanner.nextLine();
                    break ;
            }
        }
        System.out.println();
        System.out.printf("%s", grade <= 0 ? "아이탬이 터졌습니다." : grade < 10 ? "강화가 완료되었습니다." : "축하드립니다. 아이템의 능력치가 최대치에 도달하였습니다.\n현재등급 : max" );
    }
}