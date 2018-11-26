import java.util.ArrayList;

public class Hangar {
    private ArrayList<Plane> storage;

    public Hangar(){
        this.storage = new ArrayList<>();
    }

    public int getStorageSize(){
        return this.storage.size();
    }

    public void addPlane(Plane plane){

        this.storage.add(plane);
    }

    public void removePlane(Plane plane){
        this.storage.remove(plane);
    }

    public ArrayList<Plane> planesInStorage(){
        return this.storage;
    }


}
