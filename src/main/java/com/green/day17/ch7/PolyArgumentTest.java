package com.green.day17.ch7;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Computer c = new Computer();
        int price = c.getPrice();
        int bonusPrince = c.getBonusPoint();
        Tv tv = new Tv();
        int tvprice = c.getPrice();
        int tvbonusPrince = c.getBonusPoint();
    }
}

class PolyArgumentTest2{
    public static void main(String[] args) {
        Buyer buyer = new Buyer();

        System.out.println(buyer); // money : 1000, bp : 0
        buyer.buy(new Tv());
        System.out.println(buyer); // 750 30
        buyer.buy(new Computer());
        System.out.println(buyer); // 750 30
        buyer.buy(new Computer());

        // buyer가 money부족하면 "잔액 부족" money값 마이너스 처리 x
        // 잔액이 부족하지 안으면 Tv을/를 구입하셨습니아. > mpney 마이너스 처리,
        // bonusPoint 플러스 처리
    }
}
class Buyer{
    private int money;
    private int bonusPoint;
    public Buyer(){
        money = 1050;
        bonusPoint = 0;
    }

    public void buy(Product product){
        System.out.printf("제품명 : %s\n", product);
        System.out.printf("price : %d\n", product.getPrice());
        System.out.printf("bonusPoint : %d\n", product.getBonusPoint());

        // buyer가 money부족하면 "잔액 부족" money값 마이너스 처리 x
        // 잔액이 부족하지 안으면 Tv을/를 구입하셨습니아. > mpney 마이너스 처리,
        // bonusPoint 플러스 처리

/*        while (true){
            money -= product.getPrice();
            bonusPoint += product.getBonusPoint();
            System.out.printf("%s을/를 구입하셨습니다%d,%d.\n",product, money, bonusPoint);
            if(money<500){break;}
            if(money<product.getPrice()){
                System.out.println("잔액이부족합니다.");
                break;
            }
        }*/
        if(money < product.getPrice()) {
            System.out.println("잔액 부족");
            return;
        }
        //money = money - product.getPrice();
        money -= product.getPrice();
        bonusPoint += product.getBonusPoint();
        System.out.printf("%s을/를 구매하셨습니다.", product);


    }


    /*public void buy(Tv tv){
        System.out.printf("price : %d", tv.getPrice());
    }
    public void buy(Computer computer){
        System.out.printf("price : %d", computer.getPrice());
    }*/
    @Override
    public String toString(){
        return String.format("money : %d, bonisPoint : %d", money, bonusPoint);
    }
}
class Product{
    private int price;
    private int bonusPoint;
    protected Product(int n){
        this.price = n;
        this.bonusPoint = (int)(n*0.1);
    }
    int getPrice(){
        return price;
    }
    int getBonusPoint(){
        return bonusPoint;
    }
    @Override
    public String toString(){
        return String.format("price : %d, bonisPoint : %d", price, bonusPoint);
    }
}
class Tv extends Product{
    Tv(){
        super( 100);
    }
    @Override
    public String toString(){
        //return "Tv, " + super.toString();
        return "Tv";
    }
}
class Computer extends Product{
    Computer(){
        super( 200);
    }

    @Override
    public String toString(){
        //return "Computer, " + super.toString();
        return "Computer";
    }
}