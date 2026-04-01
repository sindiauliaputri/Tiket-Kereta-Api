package Model;

public class TiketEkonomi extends Kereta implements Pembayaran {

    Ticket ticket;

    public TiketEkonomi(Ticket ticket) {
        super("Kereta Ekonomi");
        this.ticket = ticket;
    }

    @Override
    public void jenisKereta() {
        System.out.println("Jenis Kereta : " + namaKereta);
    }

    @Override
    public void bayarTiket() {
        System.out.println("Pembayaran Tiket Ekonomi Berhasil");
    }

    public void tampilkan() {
        jenisKereta();
        ticket.tampilkanTicket();
        bayarTiket();
    }
}