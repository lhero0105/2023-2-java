package com.green.ClassExs;

public class Interface {
    public static final int A = 1;
    public void turnOn(){}
}
interface Tv{
    public void turnOn();
    public void turnOff();
}
class LedTv implements Tv{

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
}