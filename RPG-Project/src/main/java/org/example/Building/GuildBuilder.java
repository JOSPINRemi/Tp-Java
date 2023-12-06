package org.example.Building;

public class GuildBuilder extends BuildingBuilder {
    private Building building = new Building("Guild");
    @Override
    void buildFirstRoom() {
        building.setFirstRoom("Guild hall");
    }

    @Override
    void buildSecondRoom() {
        building.setSecondRoom("Guild's request wall");
    }
    @Override
    public Building getResult(){
        return building;
    }
}
