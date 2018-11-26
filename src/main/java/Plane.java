import java.util.ArrayList;

public class Plane {
    private PlaneType plane;
    private AirLine airLine;
    private ArrayList<Passenger> passengers;

    public Plane(PlaneType plane, AirLine airLine){
        this.plane  = plane;
        this.airLine = airLine;
        this.passengers = new ArrayList<>();
    }

    public PlaneType getPlane(){
        return this.plane;
    }

    public AirLine getAirLine(){
        return this.airLine;
    }

    public ArrayList getPassengers(){
        return this.passengers;
    }
}
