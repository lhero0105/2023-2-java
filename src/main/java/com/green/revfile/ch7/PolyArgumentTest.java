package com.green.revfile.ch7;

class product{
    int price;
    int bonusPoint;
    product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}
class Tv extends product{
    Tv(){
        super(100);
    }
    public String toString(){ return "TV"; }
}
class Computer extends product{
    Computer(){super(200);}
    public String toString(){ return "Computer"; }
}
class Buyer{
    int money = 1000;
    int bonusPoint = 0;
    void buy(product p){
        if(money < p.price){
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "을/를 구입하셨습니다.");
    }
}
class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer());

        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 남은 보너스점수는 " + b.bonusPoint + "점입니다.");
    }
}