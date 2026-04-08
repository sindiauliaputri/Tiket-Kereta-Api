package Repository;

import Model.Kereta;
import Model.TicketBisnis;
import Model.TicketEkonomi;
import java.util.ArrayList;
import java.util.List;

public class TicketRepository {

    private List<Kereta> daftarKereta = new ArrayList<>();

    public TicketRepository() {

        daftarKereta.add(new TicketBisnis(
                "Argo Wilis",
                "Bandung - Surabaya",
                300000
        ));

        daftarKereta.add(new TicketEkonomi(
                "Lodaya",
                "Bandung - Solo",
                250000
        ));

        daftarKereta.add(new TicketBisnis(
                "Turangga",
                "Bandung - Jakarta",
                200000
        ));
    }

    public List<Kereta> getDaftarKereta() {
        return daftarKereta;
    }
}