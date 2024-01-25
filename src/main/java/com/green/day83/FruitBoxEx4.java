package com.green.day83;

import java.util.List;

public class FruitBoxEx4 {
    public static void main(String[] args) {
        FruitBoxV2<Apple> appleBox = new FruitBoxV2<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        String strMix = FruitBoxV2.mix(new Toy(), new Toy());
        System.out.println("strMix : " + strMix);
    }
}

class FruitBoxV2<T extends Fruit> extends GBoxList<T> {
    List<T> getList() { return list; }

    static <A> String mix(A var1, A var2){ // static이기에 별개
        return var1.toString() + var2.toString();
    }
}