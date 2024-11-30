/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
class Bus extends Kendaraan {
    private int kapasitasPenumpang;

    Bus(String platNomor, String model, int tahun, int kapasitasPenumpang) {
        super(platNomor, model, tahun);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    void setKapasitasPenumpang(int kapasitasPenumpang) {
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    double hitungBiayaPerjalanan(double jarak) {
        return jarak * 1000; // Biaya per km
    }
}
