package org.example.Building;

public class Building {
    private String type;
    private String firstRoom;
    private String secondRoom;
    private boolean hasRoof;
    Building(String type) {
        this.type = type;
    }
    public void setFirstRoom(String firstRoom) {
        this.firstRoom = firstRoom;
    }
    public void setSecondRoom(String type) {
        this.secondRoom = secondRoom;
    }
    public void setHasRoof(Boolean hasRoof) {
        this.hasRoof = hasRoof;
    }

    @Override
    public String toString() {
        return "Building{" +
                "type='" + type + '\'' +
                ", firstRoom='" + firstRoom + '\'' +
                ", secondRoom='" + secondRoom + '\'' +
                ", hasRoof=" + hasRoof +
                '}';
    }
}
