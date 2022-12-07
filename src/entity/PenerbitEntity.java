package entity;

public class PenerbitEntity {
    private String penerbit;
    private int tahunTerbit;


    public PenerbitEntity(String penerbit, int tahunTerbit) {
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
    }


    public String getPenerbit() {
        return this.penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getTahunTerbit() {
        return this.tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

}
