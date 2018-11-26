public enum Destination {
    SPAIN(300),
    GREECE(500),
    EDINBURGH(1),
    GLASGOW(1),
    LONDON(150),
    AUSTRALIA(700),
    AMSTERDAM(100),
    NORWAY(200),
    ICELAND(250),
    BULGARIA(350),
    TENEREIFE(450),
    MAGALUF(320);

    public final int price;

    Destination(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }
}

