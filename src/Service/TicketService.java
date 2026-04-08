package Service;

import Model.Kereta;
import Repository.TicketRepository;
import java.util.List;

public class TicketService {

    private TicketRepository repo = new TicketRepository();

    public void tampilkanKereta() {

        List<Kereta> daftarKereta = repo.getDaftarKereta();

        System.out.println("Daftar Kereta:");

        for (int i = 0; i < daftarKereta.size(); i++) {

            Kereta k = daftarKereta.get(i);

            System.out.println((i + 1) + ". "
                    + k.getNamaKereta()
                    + " (" + k.getAsal() + " -> " + k.getTujuan() + ")"
                    + " - Rp " + k.getHarga());
        }
    }

    public Kereta pilihKereta(int index) {
        return repo.getDaftarKereta().get(index);
    }
}