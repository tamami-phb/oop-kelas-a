import entitas.*;

public class Aplikasi {

    public static void main(String[] args) {
        Mahasiswa[] dataMhs = {
          new Mahasiswa("19001", "tamami"),
          new Mahasiswa("19002", "diva"),
          new Mahasiswa("19003", "nabila")
        };

        for(Mahasiswa mhs : dataMhs) {
            mhs.cetak();
        }

        System.out.println();

        Dosen dsn1 = new Dosen();
        Dosen dsn2 = new Dosen();
        dsn1.setNid("1984001");
        dsn1.setNama("honda");
        dsn2.setNid("1988001");
        dsn2.setNama("yamaha");

        dsn1.cetak();
        dsn2.cetak();
    }

}