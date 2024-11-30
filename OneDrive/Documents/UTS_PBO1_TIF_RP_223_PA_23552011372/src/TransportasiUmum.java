/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
import java.util.ArrayList;

class ManajemenTransportasi {
    private ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();
    private ArrayList<String> rute = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    // Registrasi Kendaraan
    void registrasiKendaraan() {
        System.out.println("=== Registrasi Kendaraan ===");
        System.out.print("Masukkan Plat Nomor: ");
        String platNomor = scanner.nextLine();
        System.out.print("Masukkan Model Kendaraan: ");
        String model = scanner.nextLine();
        System.out.print("Masukkan Tahun Kendaraan: ");
        int tahun = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer
        System.out.print("Masukkan Kapasitas Penumpang: ");
        int kapasitas = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer
        System.out.print("Masukkan Jenis Bahan Bakar: ");
        String bahanBakar = scanner.nextLine();

        Kendaraan kendaraan = new Kendaraan(platNomor, model, tahun, kapasitas, bahanBakar);
        daftarKendaraan.add(kendaraan);
        System.out.println("Kendaraan berhasil terdaftar!");
    }

    // Hitung Biaya Perjalanan
    void hitungBiayaPerjalanan() {
        System.out.println("=== Hitung Biaya Perjalanan ===");
        System.out.print("Masukkan Jarak Tempuh (km): ");
        double jarak = scanner.nextDouble();
        scanner.nextLine(); // Membersihkan buffer

        double totalBiaya = 0;
        for (Kendaraan kendaraan : daftarKendaraan) {
            totalBiaya += kendaraan.hitungBiaya(jarak);
        }
        System.out.println("Total Biaya Perjalanan: " + totalBiaya);
    }

    // Manajemen Rute
    void manajemenRute() {
        System.out.println("=== Manajemen Rute ===");
        System.out.print("Masukkan Rute Baru: ");
        String ruteBaru = scanner.nextLine();
        rute.add(ruteBaru);
        System.out.println("Rute berhasil ditambahkan!");
    }

    // Tampilkan Laporan
    void tampilkanLaporan() {
        System.out.println("=== Laporan Perjalanan ===");
        System.out.println("Daftar Kendaraan:");
        for (Kendaraan kendaraan : daftarKendaraan) {
            System.out.println(kendaraan);
        }
        System.out.println("Rute Perjalanan:");
        for (String r : rute) {
            System.out.println("- " + r);
        }
    }
}
