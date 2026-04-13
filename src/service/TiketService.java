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

    // tampilkan daftar kereta + nomor
    public void tampilkanDaftarKereta() {

        System.out.println("\nDaftar Kereta:");
        System.out.println("1. Argo Wilis (" + ruteKereta.get("Argo Wilis") + ") | Harga: " + hargaKereta.get("Argo Wilis"));
        System.out.println("2. Lodaya (" + ruteKereta.get("Lodaya") + ") | Harga: " + hargaKereta.get("Lodaya"));
        System.out.println("3. Turangga (" + ruteKereta.get("Turangga") + ") | Harga: " + hargaKereta.get("Turangga"));
        System.out.println();
    }

    // mapping angka ke nama kereta
    public String getNamaKereta(int pilihan) {
        switch (pilihan) {
            case 1:
                return "Argo Wilis";
            case 2:
                return "Lodaya";
            case 3:
                return "Turangga";
            default:
                return null;
        }
    }

    // proses pemesanan
    public void pesanTiket(String namaPenumpang, String namaKereta, String kelas, int jumlah) {

        if (!hargaKereta.containsKey(namaKereta)) {
            System.out.println("Kereta tidak ditemukan!");
            return;
        }

        int harga = hargaKereta.get(namaKereta);

        if (kelas.equalsIgnoreCase("Bisnis")) {
            harga += 50000;
        } else if (kelas.equalsIgnoreCase("Ekonomi")) {
            harga += 20000;
        }

        int total = harga * jumlah;

        System.out.println("\n=== STRUK TIKET ===");
        System.out.println("Nama Penumpang : " + namaPenumpang);
        System.out.println("Kereta         : " + namaKereta);
        System.out.println("Rute           : " + ruteKereta.get(namaKereta));
        System.out.println("Kelas          : " + kelas);
        System.out.println("Harga Tiket    : " + harga);
        System.out.println("Jumlah Tiket   : " + jumlah);
        System.out.println("Total Bayar    : " + total);
    }
}