package com.green.day84;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        int[] intArr = { 10, 2, 22, 80, 90, 33 };
        Integer[] integerArr = { 10, 2, 22, 80, 90, 33 };
        Stream<Integer> stream1 = Arrays.stream(intArr).boxed(); // 동일
        Stream<Integer> stream2 = IntStream.of(intArr).boxed(); // 동일
        Stream<Integer> stream3 = Stream.of(integerArr);
        List<Integer> list = stream1.sorted().limit(3).collect(Collectors.toList());
        // 오름차순 3개

        stream1.forEach(item -> System.out.println(item)); // 1회성이라 한번 더 사용x error
        // Consumer<? super Integer> action은 void메소드
        IntStream.of(intArr).boxed().sorted().limit(3).forEach(item -> System.out.println(item));

        System.out.println(list);
        System.out.println(Arrays.toString(intArr));
    }
}
