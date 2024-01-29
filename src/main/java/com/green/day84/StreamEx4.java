package com.green.day84;

import java.io.File;
import java.util.stream.Stream;

public class StreamEx4 {
    // 배열 객체
    public static void main(String[] args) {
        File[] fileArr = {
                new File("EX1.java"), new File("EX1.hak")
                , new File("EX2.java"), new File("EX2")
                , new File("EX2.txt")
        };
        Stream<File> fileStream = Stream.of(fileArr);
        Stream<String> strStream = fileStream.map(item -> item.getName());
        strStream.forEach(System.out::println);

        Stream.of(fileArr).map(File::getName)
                .filter(item -> item.indexOf(".") != -1)
                // .이 없는거 거름
                .map(item -> item.substring(item.indexOf(".") + 1))
                // .뒤에 것만 으로 만듬
                .map(item -> item.toUpperCase())
                .distinct();
        // indexOf() - 만족하는 값이 없으면 -1을 리턴
    }
}
