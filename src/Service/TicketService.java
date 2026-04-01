package Service;

import Model.Ticket;
import Repository.TicketRepository;

public class TicketService {

    TicketRepository repo = new TicketRepository();

    public void tambahTicket(Ticket ticket) {
        repo.simpan(ticket);
        System.out.println("Service tiket berhasil dijalankan");
    }
}