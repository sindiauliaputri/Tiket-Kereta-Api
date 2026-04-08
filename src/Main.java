// tugas pertemuan 3
import java.util.Scanner;
import service.TiketService;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        TiketService tiketService = new TiketService();

        System.out.println("=== PEMESANAN TIKET KERETA API ===");

        System.out.print("Masukkan Nama Penumpang: ");
        String nama = input.nextLine();

        tiketService.tampilkanDaftarKereta();

        System.out.print("Pilih Kereta: ");
        String kereta = input.nextLine();

        System.out.print("Pilih Kelas (Bisnis/Ekonomi): ");
        String kelas = input.nextLine();

        System.out.print("Jumlah Tiket: ");
        int jumlah = input.nextInt();

        tiketService.pesanTiket(nama, kereta, kelas, jumlah);
    }
}