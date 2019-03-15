import entitas.Mahasiswa;

public class Aplikasi {

    public static void main(String[] args) {
        Mahasiswa[] dataMahasiswa = {
          new Mahasiswa("19001", "tamami"),
          new Mahasiswa("19002", "diva"),
          new Mahasiswa("19003", "nabila")
        };

        for(Mahasiswa data : dataMahasiswa) {
            data.cetak();
        }
    }

}