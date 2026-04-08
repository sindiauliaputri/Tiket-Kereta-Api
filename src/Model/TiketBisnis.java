package Model;

public class TiketBisnis extends Kereta {

    public TiketBisnis(String namaKereta, String asal, String tujuan, int harga) {
        super(namaKereta, asal, tujuan, harga);
    }

    @Override
    public void jenisKereta() {
        System.out.println("Kereta Bisnis: " + namaKereta);
    }
}