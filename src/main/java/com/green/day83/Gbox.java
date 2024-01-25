package com.green.day83;

public class Gbox<T> { // T는 의미 없음
    private T item;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return this.item;
    }
}
