/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
class Mobil extends Kendaraan {
    private int kapasitas;

    Mobil(String platNomor, String model, int tahun, int kapasitas) {
        super(platNomor, model, tahun);
        this.kapasitas = kapasitas;
    }

    int getKapasitas() {
        return kapasitas;
    }

    void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    double hitungBiayaPerjalanan(double jarak) {
        return jarak * 1500; // Biaya per km
    }
}
