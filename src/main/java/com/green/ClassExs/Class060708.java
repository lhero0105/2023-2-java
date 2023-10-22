package com.green.ClassExs;

import java.util.Scanner;

public class Class060708 {
    private String owner;
    private long balance;
    Class060708(){

    }
    Class060708(String owner){
        this.owner = owner;
    }
    Class060708(long balance){
        this.balance = balance;
    }
    Class060708(String owner, long balance){
        this.owner = owner;
        this.balance = balance;
    }
    void setOwner(String owner){
        this.owner = owner;
    }
    void setBalance(long balance){
        this.balance = balance;
    }
    String getOwner(){
        return owner;
    }
    long getBalance(){
        return balance;
    }
    public long deposit(long amount){
        System.out.println(amount+ "만큼 입금 합니다.");
        return this.balance += amount;
    }
    public long withdraw(long amount){
        Scanner scanner = new Scanner(System.in);
        long money = amount;
        System.out.println("현재 고객님은 " + this.balance + "원 까지 인출할 수 있습니다.");
        if(this.balance < amount){
            System.out.println("잔액이 부족하여 인출하실 수 없습니다.");
            System.out.println("가진 금액을 모두 출금 하시겠습니까? y/n");
            String se[] = {"y", "n"};
            String sel = scanner.next();
            if(sel.equals(se[0])){
                money = this.balance;
            }
        }
        System.out.println(money + "만큼 인출 합니다.");
        return this.balance -= money;
    }
    void show(){
        System.out.println(this.owner + "님은 현재" + this.balance + "원을 가지고 있습니다.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Class060708 player = new Class060708();

        System.out.println("사용자 성함을 입력하세요 : ");
        String owner = scanner.next();
        player.setOwner(owner);
        System.out.print("사용자의 잔액은 얼만큼 있는지 적으세요. : ");
        long balance = scanner.nextLong();
        player.setBalance(balance);
        player.show();

        System.out.println("얼만큼 저축 하시겠습니까?");
        int amo = scanner.nextInt();
        player.deposit(amo);
        player.show();
    }
}
