package com.green.ClassExs;

/*
 * 3. 다음에 구현된 Circle 클래스를 참고로 다음을 만족하는 Cylinder 클래스를 작성하시오.
·          원통을 나타내는 Cylinder 클래스는 Circle형의 원과 실수형의 높이를 필드로 선언
·          메소드 getVolume()은 원통의 부피를 반환
·          Cylinder 클래스의 main() 메소드에서 반지름이 2.8, 높이가 5.6의 원통의 부피를 출력
·          다음은 원을 나타내는 클래스 Circle

4. 위에서 구현한 Cylinder를 다음 조건에 맞도록 기능을 추가하여 작성하시오.
·          다음과 같은 객체 생성이 가능하도록 생성자를 구현
ㆍ     Cylinder cd = new Cylinder(new Circle(2.8), 5.6);
 */
public class Class0304 {
    Circle circle ;
    double height;
    public Class0304(Circle circle, double height){
        this.circle = circle;
        this.height = height;
    }
    public double volume(){
        return circle.getArea() * height;
    }

/*    public void Class03(Circle circle, double height){
        this.circle = circle;
        this.height = height;
    }
    public void setCircle(Circle c){
        circle = c;
    }
    static public double getVolume(){
        return circle * height;
    }*/

    public static void main(String[] args) {
        Circle circle = new Circle(2.8);
        Class0304 cd = new Class0304(new Circle(2.8), 5.6);
        double height = 5.6;

        //System.out.println("부피 : " + circle.getArea() * height);
        System.out.println("부피 : " + cd.volume());
    }

}

class Circle {

    static public double radius;

    public static double PI = 3.141592;


//생성자 구현

    public Circle(double radius) {

        this.radius = radius;

    }

//현재 반지름을 사용하여 원의 면적을 구하는 메소드

    public static double getArea() {

        return radius * radius * PI;

    }


}