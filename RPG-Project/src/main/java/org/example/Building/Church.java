package org.example.Building;

public class Church extends Building{
    private Church(Church.Builder builder) {
        super();
        this.color=(builder.color==null)? "blanc":builder.color;
        this.size=(builder.size==0)?4:builder.size;
        this.material=(builder.material==null)?"Marbre et roche":builder.material;
        this.priceGold= builder.priceGold;
        this.name=(builder.name==null)? "church":builder.name;
        this.numberOfRooms= builder.numberOfRooms;
    }
    public static class Builder{
        private String color;
        private int size;
        private String material;
        private int priceGold;
        private int numberOfRooms;
        private String name;

        public Church.Builder color(String color) {
            this.color = color;
            return this;
        }
        public Church.Builder size(int size) {
            this.size = size;
            if(size < 0){
                throw new RuntimeException("impossible d'avoir un chateau avec une taille négative");
            }
            return this;
        }
        public Church.Builder material(String material) {
            this.material = material;
            return this;
        }
        public Church.Builder priceGold(int priceGold) {
            this.priceGold = priceGold;
            return this;
        }
        public Church.Builder name(String name) {
            this.name = name;
            return this;
        }
        public Church.Builder numberOfRooms(int numberOfRooms) {
            this.numberOfRooms = numberOfRooms;
            if(numberOfRooms<0){
                throw new RuntimeException("impossible d'avoir un chateau avec aucune piece");
            }
            return this;
        }
        public Church build(){
            return new Church(this);
        }
    }
}
