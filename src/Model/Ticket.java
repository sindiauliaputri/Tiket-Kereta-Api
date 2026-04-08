package model;

public class Ticket {

    private String idTicket;
    private String namaPenumpang;
    private String asal;
    private String tujuan;
    private double harga;

    public Ticket(String idTicket, String namaPenumpang, String asal, String tujuan, double harga) {
        this.idTicket = idTicket;
        this.namaPenumpang = namaPenumpang;
        this.asal = asal;
        this.tujuan = tujuan;
        this.harga = harga;
    }

    public String getIdTicket() {
        return idTicket;
    }

    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public String getAsal() {
        return asal;
    }

    public String getTujuan() {
        return tujuan;
    }

    public double getHarga() {
        return harga;
    }

    public void tampilkanTicket() {
        System.out.println("ID Ticket : " + idTicket);
        System.out.println("Nama      : " + namaPenumpang);
        System.out.println("Asal      : " + asal);
        System.out.println("Tujuan    : " + tujuan);
        System.out.println("Harga     : " + harga);
    }
}