package com.green.day2.ch3;
// 계산하고자 하는 바를 표현 > "식"
// 결과로 얻은 것 > "식을 평가"
// 산술(+ - * / % << >>), 비교(< > <= >= == !=), 논리(&& || ! & | ^ ~), 대입(=), 기타 연산자(삼항 형변환 instanceof)
// 우선순위 - 산술 > 비교 > 논리 > 대입
// 대입, 단항을 제외한 모든 연산의 진행방향(결합규칙)은 왼쪽에서 오른쪽
public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 2_000_000;


        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}
