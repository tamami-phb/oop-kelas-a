public class Aplikasi {
    public static void main(String args[]) {
        Mahasiswa mhs1 = 
            new Mahasiswa("19001", "tamami");
        Mahasiswa mhs2 = 
            new Mahasiswa("19002", "oka");
        Mahasiswa mhs3 = new Mahasiswa();

        mhs1.cetak();
        mhs2.cetak();
        System.out.println(mhs1.getNim());
        //mhs1.nama = "tamami";
        //mhs1.nim = "19001";
        //System.out.println(mhs1.nim + " : " + 
        //  mhs1.nama);
        //System.out.println(mhs2.nim + " : " + 
        //  mhs2.nama);
    }
}