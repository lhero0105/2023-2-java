package com.green.day14.ch6;
// static 매서드에서는 this를 사용 할 수 없습니다. > this는 참조변수로 static이 메모리에 올라간 시점이 이르기 때문
public class Car {
    String color;
    String gearType;//변속기 종류 - auto(자동), menual(수동)
    int door; // 문의 개수
    public Car(){
        this("white");// 생성자 호출

/*        color = "white";
        gearType = "auto";
        door = 4;*/

    }
    public Car(String color) {
        this(color, "auto", 4);

/*        this.color = color;
        gearType = "auto";
        door = 4;*/
    }
    public Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    void printMySelf(){
        System.out.printf("color = %s, gearType = %s, door =%d\n", color,gearType,door);
    }
}
class CarTest{
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("blue");

        car1.printMySelf(); // color =white, gearType=auto, door =4
        car2.printMySelf(); // color =white, gearType=auto, door =4
    }
}
