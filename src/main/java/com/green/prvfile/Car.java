package com.green.prvfile;

public class Car {
    String color;
    String gearType;//변속기 종류 - auto(자동), menual(수동)
    int door; // 문의 개수
    Car(){
        this("white","auto",4);
    }
    Car(String color){
        this(color, "auto", 4);
    }
    Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
    void printMySelf(){
        System.out.printf("color = %s, gearType = %s, door =%n", color,gearType,door);

    }
}
class CarTest{
    public static void main(String[] args) {
        Car car3 = new Car();
        Car car4 = new Car("blue");

        car3.printMySelf(); // color =white, gearType=auto, door =4
        car4.printMySelf(); // color =white, gearType=auto, door =4
    }
}