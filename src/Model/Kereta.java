package Model;

public abstract class Kereta {

    protected String namaKereta;
    protected String asal;
    protected String tujuan;
    protected int harga;

    public Kereta(String namaKereta, String asal, String tujuan, int harga) {
        this.namaKereta = namaKereta;
        this.asal = asal;
        this.tujuan = tujuan;
        this.harga = harga;
    }

    public String getNamaKereta() {
        return namaKereta;
    }

    public String getAsal() {
        return asal;
    }

    public String getTujuan() {
        return tujuan;
    }

    public int getHarga() {
        return harga;
    }

    public abstract void jenisKereta();
}