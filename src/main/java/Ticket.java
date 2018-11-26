public class Ticket {
    private Destination price;

    public Ticket(Destination price) {
        this.price = price;
    }

    public int getTicketPrice(){
        return this.price.getPrice();
    }
}
