package model;

public class TicketBisnis extends Kereta {

    public TicketBisnis(String nama, String rute, int harga) {
        super(nama, rute, harga, "Bisnis");
    }

    @Override
    public int getHarga() {
        return harga + 50000;
    }
}