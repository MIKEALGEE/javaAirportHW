import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport myAirport;

    Hangar hangar1;
    Hangar hangar2;
    Hangar hangar3;
    Plane plane1;
    Plane plane2;
    Plane plane3;
    Plane plane4;
    Flight flight1;
    Flight flight2;
    Flight flight3;
    Flight flight4;
    Ticket ticket1;
    Ticket ticket2;
    Ticket ticket3;
    Ticket ticket4;

    @Before
    public void before(){

        myAirport = new Airport(AirportCode.EDI);
       hangar1 = new Hangar();
       hangar2 = new Hangar();
       hangar3 = new Hangar();
       plane1 = new Plane(PlaneType.AIRBUSA300,AirLine.EasyJet);
       plane2 = new Plane(PlaneType.BOEING747,AirLine.Emirates);
       plane3 = new Plane(PlaneType.AIRBUSA310, AirLine.FartyMcghees);
       flight1 = new Flight(plane1,FlightNumber.E28738,Destination.AMSTERDAM,ticket1);
       flight2 = new Flight(plane2,FlightNumber.E26253,Destination.AUSTRALIA,ticket2);
       flight3 = new Flight(plane3,FlightNumber.E76257,Destination.ICELAND,ticket3);
       flight4 = new Flight(plane4,FlightNumber.E09827,Destination.MAGALUF,ticket4);
       ticket1 = new Ticket(Destination.AMSTERDAM);
       ticket2 = new Ticket(Destination.AUSTRALIA);
       ticket3 = new Ticket(Destination.ICELAND);
       ticket4 = new Ticket(Destination.MAGALUF);
    }

    @Test
    public void canGetAirportCode(){
        assertEquals(AirportCode.EDI, myAirport.getCode());
    }

    @Test
    public void canAddPlaneToHangar(){
//        String[] expectedResult = {"AIRBUSA300 EasyJet", "AIRBUSA310 FartyMcghees"};
        hangar3.addPlane(plane2);
        hangar1.addPlane(plane1);
        hangar1.addPlane(plane3);
        assertEquals(1,hangar3.getStorageSize());
        assertEquals(2,hangar1.getStorageSize());
//        assertEquals(expectedResult,());
    }

    @Test
    public void canCreateFlight(){
        Ticket ticket5;
        Flight flight5;
        ticket5 = new Ticket(Destination.GREECE);
        flight5 = new Flight(plane3,FlightNumber.E76257,Destination.GREECE,ticket5);
        myAirport.createFlight(flight5);
        assertEquals(1,myAirport.flightsPlanned());
    }

    @Test
    

}
