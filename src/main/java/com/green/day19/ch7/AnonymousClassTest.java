package com.green.day19.ch7;

public class AnonymousClassTest {
    public static void main(String[] args) {
        Runnable2 run = new RunRobot();
        new Runnable2() { // 인터페이스 앞에 new 붙었으니 익명클래스입니다.
            @Override
            public void run() {
                System.out.println("하하하");
            }
        };

    }
}
interface Runnable2{
    void run();
}

class RunRobot implements Runnable2{

    @Override
    public void run() {
        System.out.println("로봇이 달린다.");
    }
}