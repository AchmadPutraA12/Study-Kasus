package view;
import java.util.Scanner;
import model.PengunjungModel;
public class LoginPengunjungView {
    Scanner input = new Scanner(System.in);
    PengunjungModel model = new PengunjungModel();
    public void loginPengunjung() {
        String pilih;
        do {
            System.out.println("""
                    1. Akun Baru
                    2. Login
                    3. Keluar
                    """);
            System.out.print("Masukkan Pilihan = ");
            pilih = input.nextLine();
            
            switch (pilih) {
                case "1" -> model.tambahAkunUser();
                case "2" -> model.loginPengunjung();
                case "3" -> System.out.println("Keluar");
                default -> System.err.println("inputan tidak ada");
            }
        }while (!pilih.equals("3"));
    }
}
