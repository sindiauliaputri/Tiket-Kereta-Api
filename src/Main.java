import Model.Ticket;
import Model.TiketEkonomi;
import Model.TiketBisnis;
import Service.TicketService;

public class Main {

    public static void main(String[] args) {

        Ticket tiket1 = new Ticket(
                "TK001",
                "Putri",
                "Ciamis",
                "Bandung",
                150000
        );

        TiketEkonomi ekonomi = new TiketEkonomi(tiket1);

        System.out.println("===== TIKET KERETA API =====");
        ekonomi.tampilkan();

        TicketService service = new TicketService();
        service.tambahTicket(tiket1);

        System.out.println();

        Ticket tiket2 = new Ticket(
                "TK002",
                "Sindi aulia",
                "Ciamis",
                "Yogyakarta",
                300000
        );

        TiketBisnis bisnis = new TiketBisnis(tiket2);

        System.out.println("===== TIKET KERETA API =====");
        bisnis.tampilkan();
    }
}