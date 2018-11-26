import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

Flight flight;
Plane plane1;
Ticket ticket1;

@Before
    public void before(){
    ticket1 = new Ticket(Destination.AMSTERDAM);
    plane1 = new Plane(PlaneType.BOEING747,AirLine.Emirates);
    flight = new Flight(plane1, FlightNumber.E23492,Destination.AMSTERDAM,ticket1);
}

@Test
    public void canGetPlaneType(){

    assertEquals(plane1,flight.getPlane());
}

@Test
    public void canGetFlightNumber(){
    assertEquals(FlightNumber.E23492,flight.getFlightNumber());
}

@Test
    public void canGetDestination(){
    assertEquals(Destination.AMSTERDAM,flight.getDestination());
}

@Test
    public void canGetTicketPrice(){
    assertEquals(100,flight.showTicketPrice());
}



}
