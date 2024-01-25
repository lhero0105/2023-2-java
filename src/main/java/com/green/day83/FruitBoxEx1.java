package com.green.day83;

import java.util.ArrayList;
import java.util.List;

public class FruitBoxEx1 {
    public static void main(String[] args) {
        GBoxList<Fruit> fruitGBoxList = new GBoxList<>();
        fruitGBoxList.add(new Fruit()); // 가능
        fruitGBoxList.add(new Apple()); // 가능
        fruitGBoxList.add(new Grape()); // 가능
        System.out.println(fruitGBoxList);
        //fruitGBoxList.add(new Toy()); // 불가능

        GBoxList<Apple> appleGBoxList = new GBoxList<>();
        //appleGBoxList.add(new Fruit()); // 불가능
        appleGBoxList.add(new Apple()); // 가능
        //appleGBoxList.add(new Grape()); // 불가능
        //appleGBoxList.add(new Toy()); // 불가능

        // GBoxList<Fruit> fruitGBoxList2 = new GBoxList<Apple>();
        // 일단 뒤에 제네릭은 추후에 공부

        GBoxList<Toy> toyGBoxList = new GBoxList<>();
    }
}

class Fruit {
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit{
    public String toString(){
        return "Apple";
    }
}
class Grape extends Fruit{
    public String toString(){
        return "Grape";
    }
}
class Toy{
    public String toString(){
        return "Toy";
    }
}

class GBoxList<T> {
    List<T> list = new ArrayList<T>(); // <T>생략가능
    void add(T item) {
        list.add(item);
    }
    T get(int idx){
        return list.get(idx);
    }

    int size(){
        return list.size();
    }

    @Override
    public String toString(){
        return list.toString();
    }
}