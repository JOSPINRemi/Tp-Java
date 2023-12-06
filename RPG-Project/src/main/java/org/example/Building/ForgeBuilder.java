package org.example.Building;

public class ForgeBuilder extends BuildingBuilder {
    private Building building = new Building("Forge");
    @Override
    void buildFirstRoom() {
        building.setFirstRoom("Blacksmith");
    }

    @Override
    void buildSecondRoom() {
        building.setSecondRoom("Vendor");
    }
    @Override
    public Building getResult(){
        return building;
    }
}
