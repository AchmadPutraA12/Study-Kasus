package entity;

public class PengunjungEntity extends UserEntity{
    private String alamat;
    private String pekerjaan;
    private String gender;
    private String nama;
    private String buku;

    public PengunjungEntity(String username,String password, String nama, String alamat, String pekerjaan, String gender) {
        super(username, password);
        this.nama = nama;
        this.alamat = alamat;
        this.pekerjaan = pekerjaan;
        this.gender = gender;
    }

    public PengunjungEntity() {
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPekerjaan() {
        return this.pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBuku() {
        return this.buku;
    }

    public void setBuku(String buku) {
        this.buku = buku;
    }
  
}
