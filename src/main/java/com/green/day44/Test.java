package com.green.day44;
public class Test {
    public static void main(String[] args) {
        // 체이닝 기법 활용 시 this 나 자신을 리턴하는 방식입니다.
        MyInfo mi = new MyInfo()
                .title("ddd")
                .description("인스타 클론 코딩");

        System.out.println(mi);

        MyOpenAPI moa = new MyOpenAPI().info(mi);
    }
}
