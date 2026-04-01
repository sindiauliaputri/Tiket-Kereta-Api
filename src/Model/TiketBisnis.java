package Model;

public class TiketBisnis extends Kereta implements Pembayaran {

    Ticket ticket;

    public TiketBisnis(Ticket ticket) {
        super("Kereta Bisnis");
        this.ticket = ticket;
    }

    @Override
    public void jenisKereta() {
        System.out.println("Jenis Kereta : " + namaKereta);
    }

    @Override
    public void bayarTiket() {
        System.out.println("Pembayaran Tiket Bisnis Berhasil");
    }

    public void tampilkan() {
        jenisKereta();
        ticket.tampilkanTicket();
        bayarTiket();
    }
}