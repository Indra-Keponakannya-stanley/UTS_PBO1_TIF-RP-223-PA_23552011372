/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
class SepedaMotor extends Kendaraan {
    private String jenisBahanBakar;

    SepedaMotor(String platNomor, String model, int tahun, String jenisBahanBakar) {
        super(platNomor, model, tahun);
        this.jenisBahanBakar = jenisBahanBakar;
    }

    String getJenisBahanBakar() {
        return jenisBahanBakar;
    }

    void setJenisBahanBakar(String jenisBahanBakar) {
        this.jenisBahanBakar = jenisBahanBakar;
    }

    double hitungBiayaPerjalanan(double jarak) {
        return jarak * 500; // Biaya per km
    }
}
