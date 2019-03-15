public class Mahasiswa {

    private String nama;
    private String nim;

    //public Mahasiswa() {
    //    nama = "tidak ada nama";
    //    nim = "19000";
    //}

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void cetak() {
        System.out.println(nim + " : " + nama);
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

}