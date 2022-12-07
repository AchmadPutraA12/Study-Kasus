package view;
import model.PengunjungModel;
import java.util.Scanner;

public class PengunjungView {
    Scanner input = new Scanner(System.in);
    PengunjungModel model = new PengunjungModel();
    public void pengunjungMenu() {
        String pilih;
        do {
            System.out.println("""
                    1. Asu
                    2. Kirik
                    3. OPO
                    """);
            System.out.print("Masukkan Pilihan = ");
            pilih = input.nextLine();
            
            switch (pilih) {
                case "1" -> model.pinjam();
                case "2" -> model.pinjamView();
                case "3" -> System.out.println("Keluar");
                default -> System.err.println("inputan tidak ada");
            }
        }while (!pilih.equals("3"));
    }
}
