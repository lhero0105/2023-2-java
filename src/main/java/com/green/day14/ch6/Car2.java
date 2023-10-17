package com.green.day14.ch6;
// 지역변수는 사용하기 전에 반드시 초기화 해야 합니다.
// 멤버변수의 초기화 순서 - 명시적초기화 > 초기화블럭 > 생성자 (인텔리제이에서 회색처리됨)
public class Car2 {
    String color;
    String gearType;
    int door;

    Car2(){

    }
    Car2(Car2 c1){
        color = c1.color;
        gearType = c1.gearType;
        door = c1.door;
    }

    void printMySelf(){
        System.out.printf("color = %s, gearType = %s, door =%d\n", color,gearType,door);
    }
}
class Car2Test{
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.color = "black";
        c1.gearType = "menual";
        c1.door = 5;

        Car2 c2 = new Car2(c1);// 딥카피

        c1.printMySelf(); // color = black, gearType =manual, door = 5
        c2.printMySelf(); // color = black, gearType =manual, door = 5
    }
}
