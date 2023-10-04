package com.green.prvfile;

import java.util.Scanner;

// 스위치 이용
// 90점 이상은 "당신의 학점은A입니다."
// 80점 이상은 "당신의 학점은B입니다."
// 70점 이상은 "당신의 학점은C입니다."
// 나머지는 " 당신의 학점은 D입니다."
//char ct = tmp.charAt(0);
public class FlowEx10 {
    public static void main(String[] args) {
        System.out.printf("학점을 입력해주세요 >>");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int result = Integer.parseInt(input);
        char grade = 'D';

        if( result >100 || result<0 ){
            System.out.println("값을 잘못 입력하셨습니다.");
        } else {
            switch ( result/10 ){
                case 10, 9 :
                    grade = 'A';
                    break;
                case 8 :
                    grade = 'B';
                    break;
                case 7 :
                    grade = 'C';
                    break;
                default:
                    break;
            }
            System.out.printf("당신의 학점은 %c입니다.", grade);
        }
    }
}
