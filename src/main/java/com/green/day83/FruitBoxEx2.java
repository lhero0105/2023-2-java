package com.green.day83;

import java.util.List;

public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBoxList1 = new FruitBox<>();
        FruitBox<Apple> fruitBoxList2 = new FruitBox<>();
        FruitBox<Grape> fruitBoxList3 = new FruitBox<>();
        //FruitBox<Toy> toyGBoxList4 = new FruitBox<>();
        // <T extends Fruit> 를 준 순간 불가능
    }
}

class FruitBox<T extends Fruit> extends GBoxList<T> {
    List<T> getList() { return list; }
}