package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    // ArrayList yang menampung objek bertipe Mahasiswa
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    // Menambah mahasiswa ke daftar
    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    // Menampilkan semua mahasiswa
    public void tampilkanSemua() {
        System.out.println("== Daftar Mahasiswa ==");
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            Mahasiswa m = daftarMahasiswa.get(i);
            System.out.println((i + 1) + ". " + m.info());
        }
        System.out.println("Total mahasiswa: " + daftarMahasiswa.size());
    }

    // Menghitung rata-rata nilai seluruh mahasiswa
    public double hitungRataRata() {
        double total = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    // Menghitung jumlah mahasiswa yang lulus
    public int jumlahLulus() {
        int lulus = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.lulus()) {
                lulus++;
            }
        }
        return lulus;
    }
}