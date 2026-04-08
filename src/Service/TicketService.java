package Service;

import Model.Kereta;
import Repository.TicketRepository;
import java.util.List;

public class TicketService {

    TicketRepository repository = new TicketRepository();

    // menampilkan daftar kereta
    public void tampilkanKereta() {

        List<Kereta> daftarKereta = repository.getDaftarKereta();

        System.out.println("=== Daftar Kereta ===");

        int no = 1;

        for (Kereta k : daftarKereta) {
            System.out.println(no + ". "
                    + k.getNama() + " | "
                    + k.getRute() + " | "
                    + k.getJenis() + " | Rp"
                    + k.getHarga());
            no++;
        }
    }

    // mengambil kereta berdasarkan pilihan
    public Kereta getKereta(int index) {

        List<Kereta> daftarKereta = repository.getDaftarKereta();

        if (index > 0 && index <= daftarKereta.size()) {
            return daftarKereta.get(index - 1);
        }

        return null;
    }

    // menghitung total harga
    public int hitungTotal(Kereta kereta, int jumlah) {
        return kereta.getHarga() * jumlah;
    }

    // menampilkan detail pembelian
    public void tampilkanDetail(Kereta kereta, int jumlah) {

        int total = hitungTotal(kereta, jumlah);

        System.out.println("\n=== Detail Pembelian ===");
        System.out.println("Kereta : " + kereta.getNama());
        System.out.println("Rute   : " + kereta.getRute());
        System.out.println("Jenis  : " + kereta.getJenis());
        System.out.println("Harga  : Rp" + kereta.getHarga());
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Total  : Rp" + total);
    }
}