package org.example.Building;

public class BarracksBuilder extends BuildingBuilder {
    private Building building = new Building("Barracks");
    @Override
    void buildFirstRoom() {
        building.setFirstRoom("Training room");
    }

    @Override
    void buildSecondRoom() {
        building.setSecondRoom("Dormitory");
    }
    @Override
    public Building getResult(){
        return building;
    }
}
