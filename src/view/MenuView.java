package view;
import java.util.Scanner;

public class MenuView {
    Scanner input = new Scanner(System.in);
    AdminView adminview = new AdminView();
    LoginPengunjungView loginPengunjungView = new LoginPengunjungView();
        public void run() {
            String pilih;
            do {
                System.out.println("""
                        1. Admin
                        2. Pengunjung 
                        3. Keluar
                        """);
                System.out.print("Masukkan Pilihan = ");
                pilih = input.nextLine();
                
                switch (pilih) {
                    case "1" -> adminview.adminMenu();
                    case "2" -> loginPengunjungView.loginPengunjung();
                    case "3" -> System.out.println("exit");
                    default -> System.err.print("inputan tidak ada");
                }
            }while (!pilih.equals("3"));
        }
}
