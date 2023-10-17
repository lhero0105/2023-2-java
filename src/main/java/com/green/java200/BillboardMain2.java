package com.green.java200;

public class BillboardMain2 {
    public static void main(String[] args) {
        Billboard b1 = new Billboard(1,"Despacito", 1, "https://www.billboard.com/music/latin/despacito-youtube-record-justin-bieber-daddy-yankee-see-you-again-7882504/", "luis fonsi");
        showAbout(b1);
        Billboard b = b1;
        showAbout(b);
    }
    public static void showAbout(Billboard bb){
        String sf = String.format("%d, %s, %d, %s, %s", bb.getRank(), bb.getSong(), bb.getLastweek(), bb.getImagesrc(), bb.getArtist());
        System.out.println(sf);
    }
}
