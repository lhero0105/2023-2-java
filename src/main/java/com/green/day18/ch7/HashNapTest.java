package com.green.day18.ch7;

import java.util.HashMap;
import java.util.Map;

public class HashNapTest {
    public static void main(String[] args) {
        Map map = new HashMap(); // map도 인터페이스입니다.
        map.put("a", 10);// key value // 제네릭을 안쓰면 key value둘다 object입니다.
        map.put("b", 20);
        map.put("b", 30);// 중복된 key가 들어갈때는 이전 키,값을 지금의 것으로 업데이트

        Object obj = map.get("b");
        int val = (int)obj;
        System.out.println("val : " + val);
    }
}
class HashNapTest2{
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Tv", 0);
        map.put("Computer", 0);
        map.put("Audio", 0);
        map.put("Tv", map.get("Tv") + 1);// 복합식
        map.put("Tv", map.get("Tv") + 1);
        map.put("Tv", map.get("Tv") + 1);


        System.out.println("Tv-Count : " + map.get("Tv"));
        System.out.println("size : " + map.size());
    }
}
