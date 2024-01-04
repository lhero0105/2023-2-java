package com.green.day44;

public class MyInfo {
    private String title;
    private String description;
    public MyInfo title(String title){
        this.title = title;
        return this;
        // 나 자신을 리턴 합니다.
    }
    public MyInfo description(String description){
        this.description = description;
        return this;
    }
    @Override
    public String toString(){
        return String.format("title: %s, description: %s", title, description);
    }
}
