package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiri1 {
    public static void main(String[] args) {
        ArrayList<String> belanja = new ArrayList<>();

        belanja.add("Susu");
        belanja.add("Roti");
        belanja.add("Telur");
        belanja.add("Minyak");

        System.out.println("Sebelum hapus: " + belanja);

        belanja.remove(1); // hapus item ke-2 (indeks 1)

        System.out.println("Setelah hapus: " + belanja);
        System.out.println("Jumlah akhir : " + belanja.size());
    }
}