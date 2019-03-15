package entitas;

public class Mahasiswa extends Personal {

    private String nim;

    public Mahasiswa(String nim, String nama) {
        super("na", nama);
        this.nim = nim;
    }

    public void cetak() {
        System.out.println(nim + " : " +
                getNama());
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}