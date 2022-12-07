package entity;

public class AdminEntity extends UserEntity{
    private String nama;
    private int id;

    public AdminEntity(String username,String password, String nama, int id) {
        super(username, password);
        this.nama = nama;
        this.id = id;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void view(){
        System.out.println("username    = " + this.getUsername());
        System.out.println("password    = " + this.getPassword());
        System.out.println("nama        = " + this.nama);
        System.out.println("id          = " + this.id);
    }
}
