import java.util.Scanner;
import service.TiketService;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        TiketService tiketService = new TiketService();

        try {
            System.out.println("=== PEMESANAN TIKET KERETA API ===");

            // input nama
            System.out.print("Masukkan Nama Penumpang: ");
            String nama = input.nextLine();

            // tampilkan kereta
            tiketService.tampilkanDaftarKereta();

            // pilih kereta pakai angka
            System.out.print("Pilih Kereta (1-3): ");
            int pilih = Integer.parseInt(input.nextLine());

            String kereta = tiketService.getNamaKereta(pilih);

            if (kereta == null) {
                System.out.println("Pilihan tidak valid!");
                return;
            }

            // input kelas
            System.out.print("Pilih Kelas (Bisnis/Ekonomi): ");
            String kelas = input.nextLine();

            // input jumlah
            System.out.print("Jumlah Tiket: ");
            int jumlah = Integer.parseInt(input.nextLine());

            // proses
            tiketService.pesanTiket(nama, kereta, kelas, jumlah);

        } catch (Exception e) {

            System.out.println("\nTerjadi kesalahan input!");
            System.out.println("Pastikan input sesuai format.");

        } finally {
            input.close();
        }
    }
}