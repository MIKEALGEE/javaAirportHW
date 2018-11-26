public class Flight {

    private Plane plane;
    private FlightNumber flightNumber;
    private Destination destination;
    private Ticket ticket;

    public Flight(Plane plane, FlightNumber flightNumber, Destination destination, Ticket ticket){
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.ticket = ticket;
    }
    public Plane getPlane(){

        return this.plane;
    }

    public FlightNumber getFlightNumber()
    {
        return this.flightNumber;
    }

    public Destination getDestination(){

        return this.destination;
    }

    public int showTicketPrice(){
        return this.ticket.getTicketPrice();
    }

}
