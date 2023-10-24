package com.green.day17.ch7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
class PolyArgumentTestVer2_4{
    public static void main(String[] args) {
        Buyer3 buyer = new Buyer3();
        buyer.buy(new Computer2());
        buyer.buy(new Computer2());
        buyer.buy(new Computer2());
        buyer.buy(new Tv2());
        buyer.buy(new Audio2());
        buyer.buy(new Audio2());
        buyer.buy(new Audio2());
        buyer.summary();
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






class Buyer3{
    //money(정수) 저장 가능
    //bonusPoint(정수) 저장 가능
    // Product 객체의 주소값 여러개 저장 가능

    private int money;
    private int bonusPoint;
    private Product2[] productArr;
    private int i;
    private Map<String, Integer> buyItems;
    Buyer3(){
        buyItems = new HashMap();
        this.money = 3500;
        this.bonusPoint = 0;
        productArr = new Product2[10];
    }
    void buy(Product2 product){
        if(product == null) {
            System.out.println("잘못 구매하셨습니다.");
            return;
        }
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

        String productName = product.getName();
        if(buyItems.containsKey(productName)){
            buyItems.put(productName
                    , buyItems.get(productName) + 1);
        } else {
            buyItems.put(productName, 1); // 첫번째 샀을 때
        }
        System.out.printf("%s을(를) 구매하였습니다.\n", productName);
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
        int sum = 0;
        for (Product2 p : productArr) {
            if (p == null) {break;}
            sum += p.getPrice();
        }
        System.out.printf("총 구매금액: %,d, 남은금액: %,d, 보너스 포인트: %,d\n"
                , sum, money, bonusPoint);
    /*
    System.out.printf("%s: %d대", productNames[0], productCnts[0]);
    for(int i=1; i<productNames.length; i++) {
        System.out.printf(", %s: %d대", productNames[i], productCnts[i]);
    }
     */
        Set<String> namesSet = buyItems.keySet();// 중복제거
        Iterator<String> iterator = namesSet.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            int cnt = buyItems.get(key);
            System.out.printf(" %s: %d대", key, cnt);
        }
        System.out.println("를 구매하였습니다.");
    }
}