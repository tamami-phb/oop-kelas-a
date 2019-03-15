package entitas;

public class Personal {

    private String nik;
    private String nama;

    public Personal(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    public void cetak() {
        System.out.println(nik + " : " + nama);
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String toString() {
        return nik + " : " + nama;
    }
}