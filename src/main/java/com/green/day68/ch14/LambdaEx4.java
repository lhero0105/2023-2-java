package com.green.day68.ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaEx4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i + 10);
            // 10~19저장
        }
        for ( Integer var : list ) {
            System.out.println(var);
        }
        System.out.println("--------");
        list.forEach(new MyConsumer<Integer>());
        // 객체화 되는 시점에 Integer를 적으면 아래 메게변수로 T에 저장
        // String 적으면 매게변수 타입 string

        // consumer인터페이스를 상속받은 클래스를 객체화 시킨 주솟값을 담습니다.
        System.out.println("---------");


        // 익명 함수
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer o) {
                System.out.println("MyConsumer(2) : " + o);
            }
        });

        // 람다표현식
        list.forEach(i -> System.out.println("MyConsumer(3) : " + i));

        System.out.println("----------");
        list.removeIf( i -> i % 2 == 0);
        // 불린타입입니다.
        // list.removeIf( i -> { return i % 2 == 0; });
        // 한줄에서 중괄호를 생략하면 return까지 해줍니다.

        // 람다 표현식 x
        /*
        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer v) {
                return v % 2 == 0;
            }
        });
        */

        list.removeIf( v -> v % 2 == 0);
        System.out.println(list);

        list.replaceAll( v -> v <= 15 ? v * 3 : v );
        // 15 이하는 x2 처리, 나머지는 그대로
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("name", "홍길동");
        map.put("age", "23세");
        map.put("height", "172cm");
        map.forEach((k, v)-> System.out.printf("%s: %s\n", k, v));
    }
}
class MyConsumer<T> implements Consumer<T> {
    @Override
    public void accept(T o){
        // 컴파일 할 시점에 타입이 정해지는 것
        System.out.println("MyConsumer(1) : " + o);
    }
}