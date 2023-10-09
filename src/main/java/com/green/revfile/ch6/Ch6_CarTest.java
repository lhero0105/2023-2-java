package com.green.revfile.ch6;
// 생성자는 인스턴스 초기화 메서드입니다.

class Car2 {
    String color;
    String gearType;
    int door;

    Car2() {
    }

    Car2(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car2 c2 = new Car2("white", "auto", 4);
        System.out.println("c1의 color=" + c1.color + "gearType=" + c1.gearType + ", door =" + c1.door);
        System.out.println("c2의 color=" + c2.color + "gearType=" + c2.gearType + ", door =" + c2.door);
    }
}

