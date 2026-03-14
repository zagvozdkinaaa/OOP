package midterm;

import java.util.Vector;

public class TicketQueue {
    Vector<SupportTicket> tickets = new Vector<SupportTicket>();

    public TicketQueue() {
        this.tickets = new Vector<>();
    }

    public void add(SupportTicket ticket) {
        tickets.add(ticket);
    }

    public void closeTicket(int number){
        tickets.remove(number);
    }

    @Override
    public String toString() {
        return  "TicketQueue [tickets=" + tickets + "]";
    }
}
