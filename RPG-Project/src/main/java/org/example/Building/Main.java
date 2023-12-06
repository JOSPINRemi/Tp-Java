package org.example.Building;

public class Main {

    public static void main(String[] args){
        Barracks barracks = new Barracks.Builder()
                .numberOfRooms(2)
                .name("Sentinel's barrack")
                .priceGold(100000)
                .size(150)
                .build();
        System.out.println(barracks);
    }

}
