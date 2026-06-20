// Nama: [Nama Kamu]
// NPM : [NPM Kamu]

package tugas;

public class MainTugas {
    public static void main(String[] args) {
        // Array nama mata kuliah (ukuran tetap)
        String[] mataKuliah = {"Pemrograman Berbasis Objek", 
                               "Struktur Data", 
                               "Basis Data"};

        System.out.println("== Daftar Mata Kuliah ==");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }
        System.out.println();

        // Membuat objek pengelola
        KelasKuliah kelas = new KelasKuliah();

        // Menambah minimal 5 mahasiswa
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "2301001", 85.0));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "2301002", 55.0));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "2301003", 90.0));
        kelas.tambahMahasiswa(new Mahasiswa("Doni", "2301004", 45.0));
        kelas.tambahMahasiswa(new Mahasiswa("Eva", "2301005", 75.0));

        // Tampilkan semua mahasiswa
        kelas.tampilkanSemua();
        System.out.println();

        // Tampilkan rata-rata dan jumlah lulus
        System.out.println("Rata-rata nilai : " + kelas.hitungRataRata());
        System.out.println("Jumlah lulus    : " + kelas.jumlahLulus());
        System.out.println();

        // Tambah 1 mahasiswa baru
        kelas.tambahMahasiswa(new Mahasiswa("Fajar", "2301006", 68.0));
        System.out.println("Setelah tambah 1 mahasiswa baru:");
        kelas.tampilkanSemua();
    }
}