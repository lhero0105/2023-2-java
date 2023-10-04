package com.green.revfile.ch6;
// 인자는 메서드가 호출되면서 대입되므로, 인자의 타입은 매개변수의 타입과 일치하거나 자동 형변환이 가능한 것이어야 한다.
// static맴버(변수, 메서드) > 클래스 맴버(변수, 메서드) > 객체를 생성하지 않아도 됨(ex. new aaa()) --- 메모리가 올라 갈 때 이미 자동적으로 생성
public class Ch6_MyMathTest {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5l, 3l);
        long result3 = mm.multiply(5l, 3l);
        double result4 = mm.divide(5l, 3l); // long형의 값인 5L은 double형의 값인 5.0으로 자동 형변환 되어 divide의 매게변수 a에 저장된다.

        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("divide(5L, 3L) = " + result4);
    }
}
class MyMath{
    long add(long a, long b){
        long result = a+b;
        return result; // return a + b;
    }
    long subtract(long a, long b){return a-b;}
    long multiply(long a , long b){return a*b;}
    double divide(double a, double b){return a/b;}
}
