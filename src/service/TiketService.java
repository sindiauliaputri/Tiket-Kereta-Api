package service;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TiketService {

    private List<String> daftarKereta = new ArrayList<>();
    private Map<String, Integer> hargaKereta = new LinkedHashMap<>();
    private Map<String, String> ruteKereta = new LinkedHashMap<>();

    public TiketService() {

        daftarKereta.add("Argo Wilis");
        daftarKereta.add("Lodaya");
        daftarKereta.add("Turangga");

        hargaKereta.put("Argo Wilis", 150000);
        hargaKereta.put("Lodaya", 120000);
        hargaKereta.put("Turangga", 170000);

        ruteKereta.put("Argo Wilis", "Bandung - Surabaya");
        ruteKereta.put("Lodaya", "Bandung - Solo");
        ruteKereta.put("Turangga", "Bandung - Surabaya");
    }

    public void tampilkanDaftarKereta() {
        System.out.println("\nDaftar Kereta:");
        for (int i = 0; i < daftarKereta.size(); i++) {
            String k = daftarKereta.get(i);
            System.out.println((i + 1) + ". " + k + " (" + ruteKereta.get(k) + ") | Harga: " + hargaKereta.get(k));
        }
        System.out.println();
    }

    public String getKeretaByNomor(int nomor) {
        if (nomor < 1 || nomor > daftarKereta.size()) {
            return null;
        }
        return daftarKereta.get(nomor - 1);
    }

    public void pesanTiket(String namaPenumpang, String namaKereta, String kelas, int jumlah) {

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
