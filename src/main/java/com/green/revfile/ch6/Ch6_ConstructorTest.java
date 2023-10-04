package com.green.revfile.ch6;


class Data1 {
    int value;
}

class Data2 {
    int value;

    Data2(int x) {
        value = x;
    }
}

public class Ch6_ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1(); // 생성자가 없어서 컴파일러에 의해 기본 생성자가 추가됨
        Data2 d2 = new Data2(10); // Data2 d2 = new Data2(); > error x값을 주거나 생성자 Data2() 를 추가 정의해 줍니다.
    }
}
