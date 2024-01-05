package com.green.day18.ch7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MyArrayList {
    private int[] arr;

    public int[] getArr(){
        return arr;
    }

    public MyArrayList(){
        arr = new int[0];
    }
    public void add(int n){
        int[] tmp = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        tmp[arr.length] = n;
        arr = tmp;

    }
    public void add(int idx, int val){
        int[] tmp = new int[arr.length+1];
        tmp[idx] = val;
        for (int i = 0; i < arr.length; i++) {
            tmp[i<idx ? i : i+1] = arr[i];
        }
        arr =tmp;
    }

    public void add2(int idx, int val){
        int[] tmp = new int[arr.length+1];
        tmp[idx] = val;
        for (int i = 0; i < idx; i++) {
            tmp[i] = arr[i];
        }
        for (int i = idx; i < arr.length; i++) {
            tmp[i+1] = arr[i];
        }
        arr = tmp;
    }

    public String toString(){
/*        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {

            System.out.printf(String.format("%d",arr[i]));
            if(i == arr.length-1){
                break;
            }
            System.out.print(", ");
        }

        System.out.print("]");
        return "";*/

        if(arr.length == 0){
            return "[]";
        }
        String r = String.format("[%d", arr[0]);
        for (int i = 1; i < arr.length; i++) {
            r += String.format(", %d", arr[i]);
        }
        r += "]";
        return r;

        /*String tmp = "[";
        if(arr.length > 0){
            tmp += arr[0]; // 10
            for(int i=1; i < arr.length; i++){
                tmp += ", " + arr[i]; // , 20, 30, 40, ....
            }
        }
        tmp += "]";
        return tmp;*/
    }
    public void forEach(Consumer<Integer> con){
        for (int i = 0; i < arr.length; i++) {
            con.accept(arr[i]);
        }
    }
    public void removeIf2(Predicate<Integer> pre) {
        MyArrayList tempList = new MyArrayList();
        for (int i = 0; i < arr.length; i++) {
            if( !pre.test(arr[i]) ){
                tempList.add(arr[i]);
            }
        }
        this.arr = tempList.getArr();
    }

        public void removeIf(Predicate<Integer> pre){
        int[] temp = new int[0];
        for (int i = 0; i < arr.length; i++) {
            if( !pre.test(arr[i]) ){
                int[] temp2 = new int[temp.length + 1];

                for (int z = 0; z < temp.length; z++) {
                    temp2[z] = temp[z];
                }

                temp2[temp.length] = arr[i];
                temp = temp2;
            }
        }
        arr = temp;
    }
}
class MyArrayListTest{
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.add(1,40);
        System.out.println(list); // [10, 40, 20, 30]
    }
}