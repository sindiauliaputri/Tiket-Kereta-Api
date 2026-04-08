// tugas pertemuan 3
import Model.Kereta;
import Service.TicketService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        TicketService service = new TicketService();

        System.out.println("=================================");
        System.out.println("   SISTEM PEMESANAN TIKET KERETA");
        System.out.println("=================================\n");

        boolean jalan = true;

        while (jalan) {

            service.tampilkanKereta();

            System.out.print("\nPilih kereta (angka): ");
            int pilih = input.nextInt();

            Kereta keretaDipilih = service.getKereta(pilih);

            if (keretaDipilih != null) {

                System.out.print("Jumlah tiket: ");
                int jumlah = input.nextInt();

                service.tampilkanDetail(keretaDipilih, jumlah);

            } else {
                System.out.println("Kereta tidak ditemukan");
            }

            System.out.print("\nPesan lagi? (y/n): ");
            String ulang = input.next();

            if (ulang.equalsIgnoreCase("n")) {
                jalan = false;
                System.out.println("\nTerima kasih telah memesan tiket kereta 🚆");
            }

            System.out.println();
        }

        input.close();
    }
}