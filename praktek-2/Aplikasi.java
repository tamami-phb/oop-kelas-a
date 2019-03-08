public class Aplikasi {
    public static void main(String args[]) {

        if(args.length == 1) {
          int angka = Integer.parseInt(args[0]);

          String hasil = 
            (angka % 2 == 0) ? "genap" : "ganjil";
          System.out.println(hasil);
        } else {
          System.out.println(
            "Gunakan : java Aplikasi {angka}");
        }
        
        
    }
}