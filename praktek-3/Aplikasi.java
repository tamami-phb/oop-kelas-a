public class Aplikasi {
    public static void main(String args[]) {
        Mahasiswa mhs[] = {
            new Mahasiswa("19001", "tamami"),
            new Mahasiswa("19002", "diva"),
            new Mahasiswa("19003", "nabila")
        };

        // -- for
        System.out.println("for standar");
        int i = 0;
        for(; i < mhs.length; ) {
            mhs[i].cetak();
            i++;
        }

        System.out.println("\n\nanother for");
        for(Mahasiswa data : mhs) {
            data.cetak();
        }

        System.out.println("\n\nwhile");
        i=0;
        while(i < mhs.length) {
            mhs[i++].cetak();
        }

        int angka = 3;
        System.out.println(++angka);
        System.out.println(angka);
    }
}