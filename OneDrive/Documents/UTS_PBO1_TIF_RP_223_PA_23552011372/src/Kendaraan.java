/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
class Kendaraan {
    private String platNomor;
    private String model;
    private int tahun;
    private int kapasitasPenumpang;
    private String bahanBakar;

    public Kendaraan(String platNomor, String model, int tahun, int kapasitasPenumpang, String bahanBakar) {
        this.platNomor = platNomor;
        this.model = model;
        this.tahun = tahun;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.bahanBakar = bahanBakar;
    }

    public double hitungBiaya(double jarak) {
        return jarak * kapasitasPenumpang * 1000; // Contoh perhitungan biaya
    }

    @Override
    public String toString() {
        return "Plat Nomor: " + platNomor + ", Model: " + model + ", Tahun: " + tahun + 
               ", Kapasitas: " + kapasitasPenumpang + ", Bahan Bakar: " + bahanBakar;
    }
}
