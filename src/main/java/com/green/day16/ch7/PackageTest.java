package com.green.day16.ch7;

// import com.green.day15.ch7.Child;
import com.green.day13.ch6.MyMath2;
//import com.green.day13.ch6.MyMath2.staticAbs;
//import com.green.day13.ch6.MyMath2.staticNum;
import com.green.day15.ch7.Parent;
import com.green.day15.ch7.*; // ch7 아래 하위 클래스를 모두 불러옵니다.
public class PackageTest {
    public static void main(String[] args) {
        Parent parent; // 다른 패키지를 사용 할 때 alt+앤터로 임포트합니다.
        // Child child // default 제어자라 error가 뜹니다.
        MyMath2.staticNum = 10;
    }


}
