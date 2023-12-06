package org.example.Building;

public class CastleBuilder extends BuildingBuilder {
    private Building building = new Building("Castle");
    @Override
    void buildFirstRoom() {
        building.setFirstRoom("Gate");
    }

    @Override
    void buildSecondRoom() {
        building.setSecondRoom("Hall");
    }
    @Override
    public Building getResult(){
        return building;
    }
}
