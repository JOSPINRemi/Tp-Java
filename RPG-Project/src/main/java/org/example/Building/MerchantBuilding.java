package org.example.Building;

public class MerchantBuilding extends Building{
    private MerchantBuilding(MerchantBuilding.Builder builder) {
        super();
        this.color=(builder.color==null)? "Gris":builder.color;
        this.size=(builder.size==0)?4:builder.size;
        this.material=(builder.material==null)?"Pierre et glèse":builder.material;
        this.priceGold= builder.priceGold;
        this.name=(builder.name==null)? "merchantBuilding":builder.name;
        this.numberOfRooms= builder.numberOfRooms;
    }
    public static class Builder{
        private String color;
        private int size;
        private String material;
        private int priceGold;
        private int numberOfRooms;
        private String name;

        public MerchantBuilding.Builder color(String color) {
            this.color = color;
            return this;
        }
        public MerchantBuilding.Builder size(int size) {
            this.size = size;
            if(size < 0){
                throw new RuntimeException("impossible d'avoir un chateau avec une taille négative");
            }
            return this;
        }
        public MerchantBuilding.Builder material(String material) {
            this.material = material;
            return this;
        }
        public MerchantBuilding.Builder priceGold(int priceGold) {
            this.priceGold = priceGold;
            return this;
        }
        public MerchantBuilding.Builder name(String name) {
            this.name = name;
            return this;
        }
        public MerchantBuilding.Builder numberOfRooms(int numberOfRooms) {
            this.numberOfRooms = numberOfRooms;
            if(numberOfRooms<0){
                throw new RuntimeException("impossible d'avoir un chateau avec aucune piece");
            }
            return this;
        }
        public MerchantBuilding build(){
            return new MerchantBuilding(this);
        }
    }
}
