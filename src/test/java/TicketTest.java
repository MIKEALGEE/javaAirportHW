import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicketTest {

   Ticket ticket1;
   Ticket ticket2;
   Ticket ticket3;

    @Before
    public void before(){
        ticket1 = new Ticket(Destination.SPAIN);
        ticket2 = new Ticket(Destination.AMSTERDAM);
        ticket3 = new Ticket(Destination.AUSTRALIA);
    }
    @Test
    public void showTicketPrice(){
        assertEquals(300, ticket1.getTicketPrice());
        assertEquals(100, ticket2.getTicketPrice());
        assertEquals(700, ticket3.getTicketPrice());

    }




}
