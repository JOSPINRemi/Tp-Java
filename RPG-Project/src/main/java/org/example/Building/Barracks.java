package org.example.Building;

public class Barracks extends Building{
    private Barracks(Barracks.Builder builder) {
        super();
        this.color=(builder.color==null)? "rouge":builder.color;
        this.size=(builder.size==0)?4:builder.size;
        this.material=(builder.material==null)?"Pierre":builder.material;
        this.priceGold= builder.priceGold;
        this.name=(builder.name==null)? "Barracks":builder.name;
        this.numberOfRooms= builder.numberOfRooms;
    }
    public static class Builder{
        private String color;
        private int size;
        private String material;
        private int priceGold;
        private int numberOfRooms;
        private String name;

        public Barracks.Builder color(String color) {
            this.color = color;
            return this;
        }
        public Barracks.Builder size(int size) {
            this.size = size;
            if(size < 0){
                throw new RuntimeException("impossible d'avoir un chateau avec une taille négative");
            }
            return this;
        }
        public Barracks.Builder material(String material) {
            this.material = material;
            return this;
        }
        public Barracks.Builder priceGold(int priceGold) {
            this.priceGold = priceGold;
            return this;
        }
        public Barracks.Builder name(String name) {
            this.name = name;
            return this;
        }
        public Barracks.Builder numberOfRooms(int numberOfRooms) {
            this.numberOfRooms = numberOfRooms;
            if(numberOfRooms<0){
                throw new RuntimeException("impossible d'avoir un chateau avec aucune piece");
            }
            return this;
        }
        public Barracks build(){
            return new Barracks(this);
        }
    }
}
