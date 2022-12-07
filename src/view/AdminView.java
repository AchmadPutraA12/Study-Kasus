package view;

import model.AdminModel;
import java.util.Scanner;
public class AdminView {
    Scanner input = new Scanner(System.in);
    AdminModel admin = new AdminModel();
    public void adminMenu() {
        admin.dataAdmin();
        String pilih;
        do {
            System.out.println("""
                    1. Tambah data
                    2. Lihat data
                    3. Edit data
                    4. Hapus data
                    5. Cari data 
                    6. Keluar
                    """);
            System.out.print("Masukkan Pilihan = ");
            pilih = input.nextLine();
            
            switch (pilih) {
                case "1" -> admin.tambahAdmin();
                case "2" -> admin.view();
                case "3" -> admin.editDataNama();
                case "4" -> admin.menuHapus();
                case "5" -> admin.cariUser();
                case "6" -> System.out.println("exit");
                default -> System.err.println("inputan tidak ada");
            }
        }while (!pilih.equals("6"));
    } 
}
