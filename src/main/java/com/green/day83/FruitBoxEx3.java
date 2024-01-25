package com.green.day83;

public class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBoxList = new FruitBox<>();
        fruitBoxList.add(new Apple());
        fruitBoxList.add(new Apple());
        fruitBoxList.add(new Grape());

        Juice j1 = Juicer.makeJuice(fruitBoxList);
        System.out.println("j1 : " + j1);

        FruitBox<Apple> appleBoxList = new FruitBox<>();
        appleBoxList.add(new Apple());
        appleBoxList.add(new Apple());

        Juice j3 = Juicer.makeJuice(appleBoxList);
        System.out.println("j3 : " + j3);

/*        FruitBox<Toy> toyBoxList = new FruitBox();
        toyBoxList.add(new Toy());
        toyBoxList.add(new Toy());
        Juice j2 = Juicer.makeJuice(toyBoxList);*/
    }
}

class Juice {
    private String name;

    Juice(String name){
        this.name = name + "Juice";
    }

    public String toString(){
        return this.name;
    }
}

class Juicer<T> {
    static Juice makeJuice(FruitBox<? extends Fruit> box){
        // 와일드카드 ? 사용시 class와 상관없어 집니다.
        // ? extend Fruit으로 Toy는 불가
        // ? super Fruit : fruit 다 가능
        // ? super Apple : apple은 가능
        String temp = "";
        for (Fruit f : box.getList()){
            temp += f + " ";
        }
        return new Juice(temp);
    }
}
