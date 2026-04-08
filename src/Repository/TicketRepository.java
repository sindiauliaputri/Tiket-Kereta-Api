package Repository;
import Model.Kereta;
import Model.TiketBisnis;
import Model.TiketEkonomi;
import java.util.ArrayList;
import java.util.List;

public class TicketRepository {

    private List<Kereta> daftarKereta = new ArrayList<>();

    public TicketRepository() {

        daftarKereta.add(new TiketEkonomi("Argo Wilis", "Bandung", "Surabaya", 150000));
        daftarKereta.add(new TiketEkonomi("Lodaya", "Bandung", "Solo", 120000));
        daftarKereta.add(new TiketBisnis("Taksaka", "Jakarta", "Yogyakarta", 250000));
    }

    public List<Kereta> getDaftarKereta() {
        return daftarKereta;
    }
}