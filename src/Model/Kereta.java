package model;

public class Kereta {

    protected String nama;
    protected String rute;
    protected int harga;
    protected String jenis;

    public Kereta(String nama, String rute, int harga, String jenis) {
        this.nama = nama;
        this.rute = rute;
        this.harga = harga;
        this.jenis = jenis;
    }

    public String getNama() {
        return nama;
    }

    public String getRute() {
        return rute;
    }

    public int getHarga() {
        return harga;
    }

    public String getJenis() {
        return jenis;
    }
}