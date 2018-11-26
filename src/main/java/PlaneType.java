public enum PlaneType {
    BOEING747(524),
    BOEING767(375),
    AIRBUSA300(240),
    AIRBUSA310(200);



    private final int capacity;

    PlaneType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }
}
