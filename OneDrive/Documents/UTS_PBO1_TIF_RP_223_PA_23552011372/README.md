UTS Pemrograman Berorientasi Obyek 1
Mata Kuliah: Pemrograman Berorientasi Obyek 1
Dosen Pengampu: Muhammad Ikhwan Fathulloh

Profil
Nama: INDRA HERMAWAN
NIM: 23552011372

Studi Kasus
Judul Studi Kasus: Aplikasi Manajemen Transportasi

Penjelasan Studi Kasus

Aplikasi ini bertujuan untuk mengelola data kendaraan, menghitung biaya perjalanan, dan memberikan gambaran bagaimana prinsip OOP diterapkan dalam pengembangan aplikasi. Studi kasus mencakup:

-Registrasi kendaraan.
-Pengelolaan rute.
-Perhitungan biaya perjalanan.
-Penjelasan 4 Pilar OOP dalam Studi Kasus

1. Inheritance
Kelas Kendaraan menjadi superclass untuk Mobil, Bus, dan SepedaMotor. Atribut umum seperti platNomor, model, dan tahun diwarisi oleh setiap subclass.

2. Encapsulation
Data kendaraan seperti platNomor, model, dan tahun disembunyikan di dalam kelas Kendaraan. Akses ke data ini dilakukan melalui getter dan setter untuk menjaga keamanan data.

3. Polymorphism
Metode hitungBiayaPerjalanan digunakan oleh setiap subclass (Mobil, Bus, SepedaMotor) dengan implementasi yang berbeda, meskipun memiliki nama metode yang sama.

4. Abstraction
Kelas abstrak TransportasiUmum mendefinisikan metode daftarKendaraan dan hitungRute tanpa implementasi, sehingga detail implementasi diserahkan kepada subclass yang menggunakannya.