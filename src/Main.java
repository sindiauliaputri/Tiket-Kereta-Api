// tugas pertemuan 3
import Model.Kereta;
import Service.TicketService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        TicketService service = new TicketService();

        service.tampilkanKereta();

        System.out.print("Pilih kereta: ");
        int pilih = input.nextInt();

        Kereta k = service.pilihKereta(pilih - 1);

        System.out.println("\nKereta " + k.getNamaKereta());
        System.out.println("Rute: " + k.getAsal() + " ke " + k.getTujuan());
        System.out.println("Harga: Rp " + k.getHarga());
    }
}