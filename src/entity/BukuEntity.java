package entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class BukuEntity {
    private String JudulBuku;
    private String karangan;
    private int jumlah;
    private int pinjam = 1;
    private PenerbitEntity terbit;
    private String pinjamBuku;
    private String kembaliBuku;

    public BukuEntity(String JudulBuku, String karangan, PenerbitEntity terbit, int jumlah) {
        this.JudulBuku = JudulBuku;
        this.karangan = karangan;
        this.jumlah = jumlah;
        this.terbit = terbit;
    }
    
    public String getJudulBuku() {
        return this.JudulBuku;
    }

    public void setJudulBuku(String JudulBuku) {
        this.JudulBuku = JudulBuku;
    }

    public String getKarangan() {
        return this.karangan;
    }

    public void setKarangan(String karangan) {
        this.karangan = karangan;
    }

    public int getJumlah() {
        return this.jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void bukuPinjam(){
        this.jumlah-=this.pinjam;
    }

    public void bukuKembali(){
        this.jumlah+=this.pinjam;
    }

    public int getTotalBuku(){
        return this.jumlah;
    }

    public PenerbitEntity getTerbit() {
        return this.terbit;
    }

    public void setTerbit(PenerbitEntity terbit) {
        this.terbit = terbit;
    }
    

    public int getPinjam() {
        return this.pinjam;
    }

    public void setPinjam(int pinjam) {
        this.pinjam = pinjam;
    }

    public String getPinjamBuku() {
        return this.pinjamBuku;
    }

    public void setPinjamBuku(String pinjamBuku) {
        this.pinjamBuku = pinjamBuku;
    }

    public String getKembaliBuku() {
        return this.kembaliBuku;
    }

    public void setKembaliBuku(String kembaliBuku) {
        this.kembaliBuku = kembaliBuku;
    }

    public String now() {
        Locale locale = Locale.forLanguageTag("id");
        String pattern = "dd-MM-yyyy H:m:s";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern, locale);
        LocalDateTime dateTime = LocalDateTime.now();
        return dateTime.format(formatter);
    }
}
