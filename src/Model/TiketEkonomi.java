package Model;

public class TiketEkonomi extends Kereta {

    public TiketEkonomi(String namaKereta, String asal, String tujuan, int harga) {
        super(namaKereta, asal, tujuan, harga);
    }

    @Override
    public void jenisKereta() {
        System.out.println("Kereta Ekonomi: " + namaKereta);
    }
}