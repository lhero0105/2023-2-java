package com.green.day2.ch2;
// println - 출력형식 지정불가, ln > 줄바꿈
// printf - 출력형식 지정가능, 줄바꿈 x

public class Printf {
    public static void main(String[] args){
        // args 아규먼트 - 인자, 인수
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("-----------------");
        System.out.print("Hello");
        System.out.print("Hello");
        System.out.print("Hello");
        System.out.println("-----------------");
        System.out.print("Halo\n"); // 이스케이프
        System.out.print("Halo\n"); // \n 은 개행입니다.
        System.out.print("Halo\n");

        String name = "이영웅";
        int age = 23;
        char bloodType = 'B';
        float height = 178.8f;

        // 제 이름은 이영웅이고, 나이는 23세이고, 혈액형은 B형이고, 키는 173.8cm입니다.
        System.out.println("제 이름은 " + name + "이고, 나이는" + age + "세이고, 혈액향은 " + bloodType + "이고, 키는 " + height + "cm입니다.");
        System.out.printf("제 이름은 %s이고, 나이는 %d세이고, 혈액형은 %s형이고, 키는 %f%ncm입니다.", name, age, bloodType, height); // f에서 %n을 사용해도 됩니다


        System.out.printf("제 이름은 %s이고, 나이는%1d세이고, 혈액형은 %c형이고, 키는 %.3fcm입니다."
                        , name, age, bloodType, height
        );
        // 지시자
        // %b - 불리언형식
        // %d - 10진수 정수
        // %X - 16진수 정수
        // %o - 8진수 정수
        // %f - 부동 소수점 형식
        // %e $E - 지수 표현식의 형식
        // %.2f - 소숫점아래 둘째자리까지 출력
        // %c - 문자 형식
        // %s - 문자열 형식
    }
}
