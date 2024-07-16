/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SistemParkir;
import java.util.LinkedList;
import java.util.Queue;

public class SistemParkir {
    private Queue<Kendaraan> antrianParkir;

    public SistemParkir() {
        this.antrianParkir = new LinkedList<>();
    }

    public void tambahKendaraan(String idKendaraan, String jenisKendaraan) {
        Kendaraan kendaraan = new Kendaraan(idKendaraan, jenisKendaraan);
        antrianParkir.add(kendaraan);
        System.out.println("Kendaraan dengan ID " + idKendaraan + " dan jenis " + jenisKendaraan + " ditambahkan ke antrian parkir.");
    }

    public void hapusKendaraan() {
        if (!antrianParkir.isEmpty()) {
            Kendaraan kendaraan = antrianParkir.poll();
            System.out.println("Kendaraan dengan ID " + kendaraan.getIdKendaraan() + " dan jenis " + kendaraan.getJenisKendaraan() + " dikeluarkan dari antrian parkir.");
        } else {
            System.out.println("Antrian parkir kosong.");
        }
    }

    public void lihatKendaraan() {
        if (!antrianParkir.isEmpty()) {
            System.out.println("Daftar kendaraan di antrian parkir:");
            for (Kendaraan kendaraan : antrianParkir) {
                System.out.println("- " + kendaraan);
            }
        } else {
            System.out.println("Antrian parkir kosong.");
        }
    }

    public void cekStatusAntrian() {
        System.out.println("Status antrian parkir:");
        System.out.println("- Apakah antrian kosong? " + (antrianParkir.isEmpty() ? "Ya" : "Tidak"));
        System.out.println("- Jumlah kendaraan di antrian: " + antrianParkir.size());
    }

    public void cariKendaraan(String idKendaraan) {
        boolean ditemukan = false;
        for (Kendaraan kendaraan : antrianParkir) {
            if (kendaraan.getIdKendaraan().equals(idKendaraan)) {
                System.out.println("Kendaraan dengan ID " + idKendaraan + " ditemukan di antrian parkir.");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Kendaraan dengan ID " + idKendaraan + " tidak ditemukan di antrian parkir.");
        }
    }

    public static void main(String[] args) {
        // Example usage of SistemParkir
    // Membuat objek sistem parkir
    SistemParkir sistemParkir = new SistemParkir();
    
    // Menambahkan beberapa kendaraan ke dalam sistem parkir
    sistemParkir.tambahKendaraan("001", "Mobil");
    sistemParkir.tambahKendaraan("002", "Motor");
    sistemParkir.tambahKendaraan("003", "Truk");
    
    // Menampilkan daftar kendaraan yang ada di antrian parkir
    sistemParkir.lihatKendaraan();
    
    // Menghapus kendaraan dari antrian parkir
    sistemParkir.hapusKendaraan();
    
    // Menampilkan kembali daftar kendaraan setelah menghapus satu kendaraan
    sistemParkir.lihatKendaraan();
    
    // Mencari kendaraan berdasarkan ID
    sistemParkir.cariKendaraan("002");
}

}

class Kendaraan {
    private String idKendaraan;
    private String jenisKendaraan;

    public Kendaraan(String idKendaraan, String jenisKendaraan) {
        this.idKendaraan = idKendaraan;
        this.jenisKendaraan = jenisKendaraan;
    }

    public String getIdKendaraan() {
        return idKendaraan;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    @Override
    public String toString() {
        return "Kendaraan{" +
                "idKendaraan='" + idKendaraan + '\'' +
                ", jenisKendaraan='" + jenisKendaraan + '\'' +
                '}';
    }
}
