package com.green.day7.ch4;
// break - 스위치문 과 반복문에서 사용합니다
// 가장 가까운 반복문을 빠져 나옵니다.
// continue - 반복문에만 사용 가능합니다.
// continue에 네임드 쓰는 경우는 잘 없습니다.
// 반복문 블록의 가장 끝부분으로 갑니다.
// 반복문 안에서 break를 쓸 경우, 보통 분기문이나 조건문이랑 같이 사용합니다
public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if( i == 5){break;}
        }
        System.out.println("-------------");
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0){continue;}
            System.out.println(i);
        }
    }
}
