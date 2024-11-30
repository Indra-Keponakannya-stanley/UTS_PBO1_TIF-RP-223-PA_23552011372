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

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManajemenTransportasi manajemen = new ManajemenTransportasi();
        int pilihan;

        do {
            System.out.println("\n=== Aplikasi Manajemen Transportasi ===");
            System.out.println("1. Registrasi Kendaraan");
            System.out.println("2. Hitung Biaya Perjalanan");
            System.out.println("3. Manajemen Rute");
            System.out.println("4. Laporan Perjalanan");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    manajemen.registrasiKendaraan();
                    break;
                case 2:
                    manajemen.hitungBiayaPerjalanan();
                    break;
                case 3:
                    manajemen.manajemenRute();
                    break;
                case 4:
                    manajemen.tampilkanLaporan();
                    break;
                case 5:
                    System.out.println("Keluar dari aplikasi...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
