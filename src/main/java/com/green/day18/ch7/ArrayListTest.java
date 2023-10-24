package com.green.day18.ch7;

import com.green.day14.ch6.Card;

import java.util.*;
// 제네릭을 준것에따라 리턴타입이 달라집니다.
// add로 값을 넣을 때 씁니다
// 값을 뺄 때 int val1 = list.get(0);
public class ArrayListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        Object obj = 10; // object는 모든 타입을 담을 수 있습니다.
        //list.add(10, 10.3f, 10.4d, 13l, "ddd", new Card());
        // int val1 = list.get(0);
        Object val1 = list.get(0);
        int intVal = (int) val1;
        float floatVal = (float) list.get(1);
    }
}
class ArrayListTest2{
    public static void main(String[] args) {
        int v1 = 10;
        Integer v2 = 10; // 기본형의 객체형입니다 >
        System.out.println(v1 == v2);
        List<Integer> list = new ArrayList(); //490p // 제네릭안쓰고 아무거나 다 들어가는 애들은 좋지않습니다.
        //<>제네릭 : 안에 각방의 타입을 넣을 수 있습니다.
        // add 할 때마다 들어납니다 > 자료구조
        // list는 인터페이스입니다. 인터페이스는 겍체화가 될 수 없습니다. 리스트에 객체의 주솟값을 담겠다. 대표적으로 ArrayList LinkedList
        list.add(10);
        list.add(20);
        list.add(30);
        //list.add(10.3f);
        //list.add(10.3d);
        //list.add("ddd");
        int val1 = list.get(0);
        System.out.println(list.get(1)); //error

        System.out.println("size : " + list.size()); // size() 매소드로 배열의 크기를 알 수 있습니다.
        // 몇개의 값을 가지고있냐 ? size()
        // [0] : 10
        // [2] : 20
        // [1] : 30
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("[%d]: %d\n", i, list.get(i));
        }
        for ( int val : list ) { // 스프링 사용 시 반복문 사용 할 일 x
            System.out.println(val);
        }
    }
}
class ArrayListTest3{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);

        list.add(1, 100); // (index, element) 파라미터에 원하는 값을 넣고 밀어냅니다.

        System.out.println(list);
        list.add(3,200);
        System.out.println(list);

        list.remove(0);
        System.out.println(list + ", size : " + list.size());
    }
}