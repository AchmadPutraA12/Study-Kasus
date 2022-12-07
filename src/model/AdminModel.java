package model;

import entity.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminModel{
    String username;
    String password;
    String nama;
    int id;
    ArrayList <AdminEntity> admin= new ArrayList<AdminEntity>();
    Scanner input = new Scanner(System.in);
    
    public void dataAdmin(){
        AdminEntity admin1 = new AdminEntity("Ucup", "wibu", "Ucup wibu koleng", 90);
        AdminEntity admin2 = new AdminEntity("123", "9", "kiki", 123);
        admin.add(admin1);
        admin.add(admin2);
    }

    public void tambahAdmin(){
        System.out.print("Masukkan Username = ");
        username = input.nextLine();
        System.out.print("Masukkan Password = ");
        password = input.nextLine();
        System.out.print("Masukkan Nama     = ");
        nama = input.nextLine();

        System.out.print("Masukkan id       = ");
        id = input.nextInt();
        input.nextLine();
        AdminEntity admin1 = new AdminEntity(username,password,nama,id);
        admin.add(admin1);
    }

    public void view(){
        if(admin.isEmpty()){
            System.err.println("Data kosong");
        }
        else{
            for (AdminEntity adm : admin){
                System.out.println("Username    = "+ adm.getUsername());
                System.out.println("Password    = "+ adm.getPassword());
                System.out.println("Nama        = "+ adm.getNama());
                System.out.println("Id          = "+ adm.getId());
            }
        }
        
    }
    
    public void cariUser(){
        System.out.print("Cari nama ");
        nama = input.nextLine();
        AdminEntity dataCari = cariDataNama(nama);
        if(dataCari!=null){
                System.out.println("Username    = "+ dataCari.getUsername());
                System.out.println("Password    = "+ dataCari.getPassword());
                System.out.println("Nama        = "+ dataCari.getNama());
                System.out.println("Id          = "+ dataCari.getId());
        }
        else{
            System.out.println("tidak ada data");
        }
    }
    
    public AdminEntity cariDataNama (String nama){
        for (AdminEntity nama2 : admin){
            if(nama2.getNama().equals(nama)){
                return nama2;
            }
        }
        return null;
    }

    public void caridata(AdminEntity dataCari) {
        int index = indexData(dataCari);
        admin.get(index).setUsername(dataCari.getUsername());
        admin.get(index).setPassword(dataCari.getPassword());
        admin.get(index).setNama(dataCari.getNama());
        admin.get(index).setId(dataCari.getId());
    }

    public void editDataNama() {
        String pilih;
        System.out.print("Cari Nama Yang Di Edit : ");
        pilih = input.nextLine();
        AdminEntity dataCari = cariDataNama(pilih);
        if(dataCari!=null){
            System.out.print("Masukkan Username = ");
            username = input.nextLine();
            System.out.print("Masukkan Password = ");
            password = input.nextLine();
            System.out.print("Masukkan Nama     = ");
            nama = input.nextLine();
            input.nextLine();
            System.out.print("Masukkan id       = ");
            id = input.nextInt();
            dataCari.setUsername(username);
            dataCari.setUsername(password);
            dataCari.setNama(nama);
            dataCari.setId(id);;
            caridata(dataCari);
        }
        else{
            System.err.println("Data tidak ditemukan");
        }
    }

    public void menuHapus() {
        String pilih;
        System.out.print("Cari Nama Yang Di Dihapus : ");
        pilih = input.nextLine();
        AdminEntity dataCari = cariDataNama(pilih);
        if(dataCari!=null){
            hapus(dataCari);
            System.out.println("data " +dataCari.getNama() + " berhasil di hapus");
        }
        else{
            System.err.println("Data tidak ditemukan");
        }
    }

    public void hapus(AdminEntity dataCari){
        admin.remove(dataCari);
    }

    public int indexData(AdminEntity dataCari){
        return admin.indexOf(dataCari);
    }
    
    public void UserModel(){
        
    }
}
