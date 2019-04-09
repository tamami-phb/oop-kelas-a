import services.*;
import entity.*;
import java.util.*;

public class Aplikasi {

    private static MahasiswaService service;
    private static Scanner scanner;

    public static void main(String[] args) {
        service = new MahasiswaService();
        scanner = new Scanner(System.in);

        int opsi = 5;
        do {
            tampilkanMenu();
            opsi = scanner.nextInt();
            seleksi(opsi);
        } while(opsi != 5);
    }

    private static void seleksi(int opsi) {
        switch(opsi) {
            case 1:
                callFormTambahData();
                break;
            case 2:
                callFormUbahData();
                break;
            case 3:
                callFormHapusData();
                break;
            case 4:
                service.tampilkanData();
                break;
        }
    }

    private static void callFormHapusData() {
        scanner = new Scanner(System.in);

        System.out.print("NIM : ");
        String nim = scanner.nextLine();
        service.hapusData(nim);
    }

    private static void callFormUbahData() {
        scanner = new Scanner(System.in);
        String nim, nama, kelas;

        System.out.println("\n-= Form Ubah Data =-");
        System.out.print("NIM : ");
        nim = scanner.nextLine();
        System.out.print("NAMA : ");
        nama = scanner.nextLine();
        System.out.print("KELAS : ");
        kelas = scanner.nextLine();
        service.ubahData(new Mahasiswa(nim, nama, kelas));
    }

    private static void callFormTambahData() {
        scanner = new Scanner(System.in);
        String nim, nama, kelas;

        System.out.println("\n-= Form Tambah Data =-");
        System.out.print("NIM : ");
        nim = scanner.nextLine();
        System.out.print("NAMA : ");
        nama = scanner.nextLine();
        System.out.print("KELAS : ");
        kelas = scanner.nextLine();
        service.tambahData(new Mahasiswa(nim, nama, kelas));
    }

    private static void tampilkanMenu() {
        System.out.println("\n--== Aplikasi Mahasiswa ==--");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan Data");
        System.out.println("5. KELUAR");
        System.out.println("----------------");
        System.out.print  ("opsi > ");
    }

}