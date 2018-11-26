import java.util.ArrayList;

public class Airport {

    private ArrayList<Plane> planes;
    private ArrayList<Flight> flights;
    private ArrayList<Hangar> hangars;
    private ArrayList<Ticket> tickets;
    private AirportCode code;

    public Airport(AirportCode code){
        this.planes = new ArrayList<>();
        this.flights = new ArrayList<>();
        this.hangars = new ArrayList<>();
        this.tickets = new ArrayList<>();
        this.code = code;
    }

//    public void addPlanetoHangar(Plane plane, Hangar hangar){
//        hangar.add(plane);
//    }
//
//    public String[] planesInHangar(Hangar hangar){
//       String[] stringArray = {hangar.planesInStorage().toString()};
//       return stringArray;
//    }

    public AirportCode getCode(){
        return this.code;
    }

    public int flightsPlanned(){
        return this.flights.size();
    }

    public void createFlight(Flight flight){
        this.flights.add(flight);
    }


}
