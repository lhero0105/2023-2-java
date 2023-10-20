package com.green.day16.ch7;

public class Animal {
    public void crying(){
        System.out.println("동물이 운다.");
    }
}

class AnimalTest{
    public static void main(String[] args) {
        // 1, 부모타입은 자식 객체 주소값 담을 수 있다.
        Dog d1 = new Bulldog();
        Animal ani1 = d1;
        Bulldog bull = (Bulldog)ani1;
        Animal ani2 = new Dog();
        Animal ani3 = new Cat();

        // 2. 자식타입은 부모 객체 주소값 담을 수 없다.
        // Bulldog bull1 = new Dog();
        System.out.println("끝");

        // 3. 타입은 알고 있는(상속받은거 포함) 매소드만 호출할 수 있고,
        // 호출이 된다면 객체 기준이다.(가장 빨리만나는 매서드 호출)
        Bulldog bull3 = new Bulldog();
        bull3.crying();
        bull3.jump();

        Dog dog2 = new Bulldog();
        // dog2.jump();
        dog2.crying();
    }
}
class AnimalTest3{
    public static void main(String[] args) {
        Animal ani = new Cat();
        System.out.println(ani instanceof Dog);
        Dog dog = (Dog) ani; // error
        System.out.println(ani instanceof Cat);
        Cat cat = (Cat) ani;
        System.out.println("----끝----");
    }
}

class AnimalTest2{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bulldog bulldog = new Bulldog();

        callCrying(dog);
        callCrying(cat);
        callCrying(bulldog);
    }
    private static void callCrying(Animal ani){
        ani.crying();
        // bulldog.jump();
        if(ani instanceof Bulldog){
            Bulldog bulldog = (Bulldog) ani; // bulldog을 제외한 나머지는 fales, 자손타입의 부모객체주소값을 담을 수 없기 때문입니다
            bulldog.jump();
        }
        if(ani instanceof Cat){
            Cat cat = (Cat) ani;
            cat.jump();
        }
    }
}

class Dog extends Animal{
    @Override
    public void crying(){
        System.out.println("멍! 멍!");
    }
}
class Bulldog extends Dog{
    public void jump(){
        System.out.println("불독이 점프! 점프!");
    }

    @Override
    public void crying(){
        System.out.println("불독이 왈! 왈!");
    }
}
class Cat extends Animal{
    public void jump(){
        System.out.println("고양이 점프! 점프!");
    }
    @Override
    public void crying(){
        System.out.println("야옹야옹");
    }
}