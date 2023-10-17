package com.green.day14.ch6;
// (핵심) 매소드와 생성자의 차이는 무엇인가요?
// 생성자는 클래스이름과 동일하며 리턴타입이 없습니다.
// 생성자를 만들지 않으면 컴파일러가 자동적으로 추가합니다
// >> 이것을 기본생성자(defalt constructor)라고 합니다.
// 파라미터 x 오버로딩된 생성자 > 기본생성자 x
// **(error조심)기본생성자와 파라미터를 가진 생성자를 사용하고 싶을 때 기본생성자를 입력해 주어야합니다.

// 생성자를 사용하는 이유
// 1. 객체생성을 위해서
// 2. 맴버필드에 private을 붙혀 접근안되도록 생성자를 통하여 값을 넣습니다.
// 2_1. 객체생성과 동시에 맴버필드 값을 넣을 수 있습니다.

// this() - 파라미터(타입,갯수) 생성자를 호출합니다
public class Data1 {
    int value;
    int value1;
    int value2;

    public Data1(){
        this(100, 200, 300); // 파라미터로 정수 3개 받는 생성자를 호출합니다.
    }
    public Data1(int a){
        value = a;
    }
    public Data1(int a, int b, int c){
        value = a;
        value1 = b;
        value2 = c;
    }


    public void printMySelf(){
        System.out.printf("value: %d, value2: %d, value3: %d\n", value, value1, value2);
    }
}

class ConsturctorTest{
    public static void main(String[] args) {
        Data1 d = new Data1();
        d.printMySelf();
        // 생성자 이용 x
/*        d.value = 10;
        d.value1 = 20;
        d.value2 = 30;*/

        // 생성자 이용
        Data1 data1_2 = new Data1(10, 20, 30);
        data1_2.printMySelf();
    }
}
