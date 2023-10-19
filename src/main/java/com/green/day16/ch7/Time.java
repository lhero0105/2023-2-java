package com.green.day16.ch7;

public class Time {
    public final static int MIN_HOUR = 0;
    public final static int MAX_HOUR = 23;
    private int hour, minute, second;

    // 1. 생성자
    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    // 2. seter 매소드
    public void setHour(final int hour) {
        if(hour < MIN_HOUR ){ this.hour = MIN_HOUR; return; }
        if(hour > MAX_HOUR){ this.hour = MAX_HOUR; return; }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;
    }

    @Override
    public String toString(){
        //String strHour = String.valueOf(hour < 10 ? "0" + hour : hour);
        return String.format("%02d:%02d:%02d",this.hour, this.minute, this.second);
    }


}


class TimeTest {
    public static void main(String[] args) {
        Time time = new Time(10, 20, 30);
        time.setMinute(30);
        time.setHour(5);
        System.out.println(time);
    }
}