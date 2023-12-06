package org.example.Building;

public class Guild extends Building{
    private Guild(Guild.Builder builder) {
        super();
        this.color=(builder.color==null)? "Vert":builder.color;
        this.size=(builder.size==0)?4:builder.size;
        this.material=(builder.material==null)?"Pierre et glèse":builder.material;
        this.priceGold= builder.priceGold;
        this.name=(builder.name==null)? "guild":builder.name;
        this.numberOfRooms= builder.numberOfRooms;
    }
    public static class Builder{
        private String color;
        private int size;
        private String material;
        private int priceGold;
        private int numberOfRooms;
        private String name;

        public Guild.Builder color(String color) {
            this.color = color;
            return this;
        }
        public Guild.Builder size(int size) {
            this.size = size;
            if(size < 0){
                throw new RuntimeException("impossible d'avoir un chateau avec une taille négative");
            }
            return this;
        }
        public Guild.Builder material(String material) {
            this.material = material;
            return this;
        }
        public Guild.Builder priceGold(int priceGold) {
            this.priceGold = priceGold;
            return this;
        }
        public Guild.Builder name(String name) {
            this.name = name;
            return this;
        }
        public Guild.Builder numberOfRooms(int numberOfRooms) {
            this.numberOfRooms = numberOfRooms;
            if(numberOfRooms<0){
                throw new RuntimeException("impossible d'avoir un chateau avec aucune piece");
            }
            return this;
        }
        public Guild build(){
            return new Guild(this);
        }
    }
}
