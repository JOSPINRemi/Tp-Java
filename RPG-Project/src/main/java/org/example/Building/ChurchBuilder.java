package org.example.Building;

public class ChurchBuilder extends BuildingBuilder {
    private Building building = new Building("Church");
    @Override
    void buildFirstRoom() {
        building.setFirstRoom("Prayer hall");
    }

    @Override
    void buildSecondRoom() {
        building.setSecondRoom("Prayer room");
    }
    @Override
    public Building getResult(){
        return building;
    }
}
