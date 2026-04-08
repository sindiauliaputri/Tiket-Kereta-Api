package service;
import java.util.HashMap;
import java.util.Map;

public class TiketService {

    private Map<String, Integer> hargaKereta = new HashMap<>();
    private Map<String, String> ruteKereta = new HashMap<>();

    public TiketService() {

        hargaKereta.put("Argo Wilis", 150000);
        hargaKereta.put("Lodaya", 120000);
        hargaKereta.put("Turangga", 170000);

        ruteKereta.put("Argo Wilis", "Bandung - Surabaya");
        ruteKereta.put("Lodaya", "Bandung - Solo");
        ruteKereta.put("Turangga", "Bandung - Surabaya");
    }

    public void tampilkanDaftarKereta() {

    System.out.println("\nDaftar Kereta:");

    for (String k : hargaKereta.keySet()) {

        int harga = hargaKereta.get(k);
        String rute = ruteKereta.get(k);

        System.out.println("- " + k + " (" + rute + ") | Harga: " + harga);
    }

    System.out.println();
}
    public void pesanTiket(String namaPenumpang, String namaKereta, String kelas, int jumlah) {

        String keretaDipilih = null;

        for (String k : hargaKereta.keySet()) {
            if (k.equalsIgnoreCase(namaKereta)) {
                keretaDipilih = k;
                break;
            }
        }

        if (keretaDipilih == null) {
            System.out.println("Kereta tidak ditemukan!");
            return;
        }

        int harga = hargaKereta.get(keretaDipilih);

        if (kelas.equalsIgnoreCase("Bisnis")) {
            harga += 50000;
        } else if (kelas.equalsIgnoreCase("Ekonomi")) {
            harga += 20000;
        }

        int total = harga * jumlah;

        System.out.println("\n=== STRUK TIKET ===");
        System.out.println("Nama Penumpang : " + namaPenumpang);
        System.out.println("Kereta         : " + keretaDipilih);
        System.out.println("Rute           : " + ruteKereta.get(keretaDipilih));
        System.out.println("Kelas          : " + kelas);
        System.out.println("Harga Tiket    : " + harga);
        System.out.println("Jumlah Tiket   : " + jumlah);
        System.out.println("Total Bayar    : " + total);
    }
}