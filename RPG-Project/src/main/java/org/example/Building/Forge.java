package org.example.Building;

public class Forge extends Building{

    private Forge(Forge.Builder builder) {
        super();
        this.color=(builder.color==null)? "beige":builder.color;
        this.size=(builder.size==0)?4:builder.size;
        this.material=(builder.material==null)?"roche":builder.material;
        this.priceGold= builder.priceGold;
        this.name=(builder.name==null)? "Forge":builder.name;
        this.numberOfRooms= builder.numberOfRooms;
    }
    public static class Builder{
        private String color;
        private int size;
        private String material;
        private int priceGold;
        private int numberOfRooms;
        private String name;

        public Forge.Builder color(String color) {
            this.color = color;
            return this;
        }
        public Forge.Builder size(int size) {
            this.size = size;
            if(size < 0){
                throw new RuntimeException("impossible d'avoir un chateau avec une taille négative");
            }
            return this;
        }
        public Forge.Builder material(String material) {
            this.material = material;
            return this;
        }
        public Forge.Builder priceGold(int priceGold) {
            this.priceGold = priceGold;
            return this;
        }
        public Forge.Builder name(String name) {
            this.name = name;
            return this;
        }
        public Forge.Builder numberOfRooms(int numberOfRooms) {
            this.numberOfRooms = numberOfRooms;
            if(numberOfRooms<0){
                throw new RuntimeException("impossible d'avoir un chateau avec aucune piece");
            }
            return this;
        }
        public Forge build(){
            return new Forge(this);
        }
    }
}
