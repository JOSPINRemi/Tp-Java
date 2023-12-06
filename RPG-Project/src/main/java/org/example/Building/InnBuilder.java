package org.example.Building;

public class InnBuilder extends BuildingBuilder {
    private Building building = new Building("Inn");
    @Override
    void buildFirstRoom() {
        building.setFirstRoom("Reception");
    }

    @Override
    void buildSecondRoom() {
        building.setSecondRoom("rented room");
    }
    @Override
    public Building getResult(){
        return building;
    }
}
