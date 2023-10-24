package com.green.day19.ch7.starcraft2;
// 구현부가 없기에 다중상속에 문제가 안됩니다.
public interface Fighterble extends Movable, Attackable{ }

interface Movable{
    void move(int x, int y); // public abstract
}

interface Attackable{
    void attack(Unit u);
}
class Unit{
    private int currentHp;
    private int x;
    private int y;
}
class Fighter extends Unit implements Fighterble{

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void attack(Unit u) {

    }
}
class FighterTest{
    public static void main(String[] args) {
        Movable movable = new Fighter();
        movable.move(10,20);
        Fighter fighter = (Fighter) movable;
        fighter.attack(null);
        Attackable attackable = (Attackable) movable;
    }
}