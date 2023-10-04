package com.green.day1.ch1;
public class VarEx1 {
    // 클래스명 - VarEx1 매소드명 - main
    public static void main(String[] args){
        int year = 0;
        // year 로 선언하고 0 으로 초기화 -> 대입
        // 0을 복사하여 year에 대입한다
        // int - 정수형 year - 변수명
        int age = 14;
        // 14 - 현실에선 상수라 하지만, 컴퓨터는 리터럴이라 합니다.
        // 상수는 한번 입력된 값을 변경하지 못합니다.

        int a = 0, b = 0;
        // 타입이 같은 두개 이상의 변수 선언
        // int c;
            // 초기화 하지 않고 사용 error
        // System.out.println(c);
            // 컴파일 error(파일에 빨간줄) - 사람언어를 컴퓨터 언어를 바꿀 때 나는 에러
            // 런타임 error - 실행을 하니 나는 에러
        System.out.println(year); // 0
        year = 100;
        // 변수 선언, 타입 선언은 한번만 합니다.
        System.out.println(year); // 100

        System.out.println(age + age + age);
        // 나누기가 속도가 가장 느려 / 보단 * 0.1로 해주는것을 권장합니다.

    }
}
