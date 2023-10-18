package com.green.day15.ch7;
// ... extends Parent1, Parent2 - 다중상속 x
// super() - 조상의 생성자를 호출합니다. 아무것도 안쓰면 컴파일러가 자동으로 생성합니다.
// 상속받은애를 사용 할 수 있는 원리
// new Child시 heap영역에 Parent부터 올립니다.
// 그리고 참조변수가 Child를 가르키고 또 Parent를 가르킵니다.

// 조상객체는 최상위 객체인 object를 상속받고 컴파일러가 자동으로 입력해줍니다.
// object에 상속받아 11개의 매서드를 쓸 수 있습니다. ex) toString ..
// super()는 부모의 주솟값이 저장되어 있습니다.
// this()는 자신의 주솟값이 저장되어 있습니다.
// error 해결 - 기본생성자 호출, 타입이동일한 인수 넣어주기
public class Parent {
    public Parent(){}
    public Parent(int a){

    }
    int age;
}
class Child extends Parent{ // 상속 받았기에 부모가 가진 것을 이용 할 수 있습니다.
    public Child(){
        super(); // ** super와 기본생성자 관계를 이해합시다.
    };
    void  play(){
        System.out.println("놀자~");
    }
}
class Child2 extends Parent{ // Child Child2 형제관계가 존재하지않습니다.

    void jump(){
        System.out.printf("%d살의 아이가 점프를 하였다.", age);
    }
}

class Main{
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.age = 10;
        c1.play();

        Child2 c2 = new Child2(); // 다형성 - 부모가 자식의 주솟 값을 담을 수 있습니다.(다른 건 안됩니다.)
        c2.age = 7;
        c2.jump();
    }
}