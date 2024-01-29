package com.green.day84;

import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        // 무한 스트림 ver.2
        // 시작 값을 계속 추가하여 무한 반복
        Stream.iterate(0, item -> item + 2)
                .mapToInt(Integer::valueOf)
                //.mapToInt(item -> {return Integer.valueOf(item);});
                .boxed()
                .limit(10)
                //.forEach(System.out::println) 가공한 값 사용 x
                .forEach(item -> System.out.print(item + ", "));
        // return 0 + 2
        // return 2 + 2
        // return 4 + 2
    }
}
