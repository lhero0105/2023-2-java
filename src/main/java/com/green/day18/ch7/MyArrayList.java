package com.green.day18.ch7;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    private int[] arr;
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