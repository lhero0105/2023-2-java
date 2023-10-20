package com.green.day17.ch7;

public class PolyArgumentTestVer2 {
    public static void main(String[] args) {
        Product2 p = new Product2("제품명", 1000);
        System.out.println(p);
    }
}
class PolyArgumentTestVer2_2{
    public static void main(String[] args) {
        Tv2 tv = new Tv2();
        System.out.println(tv);
        Computer2 com = new Computer2();
        System.out.println(com);
        Audio2 audio = new Audio2();
        System.out.println(audio);
    }
}

class Product2{
    private String name;
    private int price;
    private int bonusPoint;
    public Product2(String name, int price){
        this.name = name;
        this.price = price;
        this.bonusPoint = price/10;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public int getBonusPoint(){
        return bonusPoint;
    }
    @Override
    public String toString(){
        return String.format("name : %s, prive : %d, bonusPoint : %d", name, price, bonusPoint);
    }
}
class Tv2 extends Product2{
    Tv2(){
        super("tv", 100);

    }
}
class Computer2 extends Product2{
    Computer2(){
        super("computer", 200);
    }
}
class PolyArgumentTestVer2_3{
    public static void main(String[] args) {
        Buyer2 buyer = new Buyer2();
        buyer.buy(new Tv2());
        buyer.buy(new Computer2());
        buyer.buy(new Computer2());
        buyer.buy(new Tv2());
        buyer.buy(new Computer2());
        buyer.buy(new Tv2());
        buyer.buy(new Computer2());
        buyer.buy(new Tv2());
        buyer.buy(new Audio2());
        buyer.buy(new Audio2());
        buyer.buy(new Tv2());
        buyer.buy(new Audio2());
        buyer.buy(new Tv2());
        buyer.buy(new Audio2());
        buyer.buy(new Computer2());

        buyer.summary();
        /*for (int i = 0; i < buyer.productArr.length; i++) {
            Product2 p =buyer.productArr[i];
            System.out.printf("arr[%d] : %s\n", i, p);
        }*/

    }
}
class Buyer2{
    //money(정수) 저장 가능
    //bonusPoint(정수) 저장 가능
    // Product 객체의 주소값 여러개 저장 가능

    private int money;
    private int bonusPoint;
    private Product2[] productArr;
    Buyer2(){
        this.money = 1000;
        this.bonusPoint = 0;
        productArr = new Product2[10];
    }
    int i = 0;
    void buy(Product2 product){
        if(i == productArr.length) {
            System.out.println("담을 수 있는 공간이 없습니다.");
            return;
        }

        if(money < product.getPrice()) {
            System.out.println("금액이 부족합니다.");
            return;
        }
        productArr[i++] = product;
        money -= product.getPrice();
        bonusPoint += product.getBonusPoint();
        System.out.printf("%s을(를) 구매하였습니다.\n", product.getName());
/*        if(i < productArr.length){
            productArr[i++] = product;

        }*/
        /*for (int i = 0; i < productArr.length; i++) {
            if(productArr[i] == null) {
                productArr[i] = product;
                break;
            }
        }*/

    }

    public void summary() {

    }
}

class Audio2 extends Product2{
    Audio2(){
        super("audio", 500);
    }
}