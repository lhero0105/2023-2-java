package com.green.day2.ch2;
// Scanner - 화면으로부터 데이터를 입력받는 기능을 제공하는 클래스
// import문 추가
// Scanner 객체의 생성
import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scaner 객체 쓸 때 한번만 불러오면 됩니다.
        // 객체 - 속성(값저장, 명사), 메서드(기능, 동사)
        // 객체를 생성할 때 new 사용
        // System.in - 화면입력
        System.out.println("두자리 정수를 하나 입력해주세요 >> ");
        String input = scan.nextLine();
        // 화면에서 입력받는 내용을 input에 저장
        // String input = scan.nextFloat();
        // 오른 쪽을 먼저 읽습니다. > 사용자가 입력 시 실행됩니다.
        // next.Line > 문자, 실수, 정수가 섞여 있을 떄 사용
        int num =Integer.parseInt(input);
        // Integer.parseInt - 문자를 정수로 바꿀 때
        // 기본형과 참조형은 형변환 할 수 없지만 파싱을 통해 가능합니다.

        System.out.println("입력내용: " + (input + input));
        System.out.printf("num=%d\n ", (num + num));
    }
}
