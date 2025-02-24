package Jobsheet1;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        // Array satu dimensi untuk kode plat
        String[] kode = {
            "B", "J", "A", "D", "B", "E", "G", "P", "H", "M", "T"
        };

        // Array dua dimensi untuk nama kota
        String[][] kota = {
            {"BANTEN", "JAKARTA", "BANDUNG"},
            {"BANDUNG", "BEKASI", "GORONTALO"},
            {"PEKALONGAN", "SEMARANG", "MALANG"},
            {"TEGAL", "", ""}
        };

        // Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor (contoh: B, J, A): ");
        String inputKode = scanner.nextLine().toUpperCase();

        // Mencari nama kota berdasarkan kode plat
        String namaKota = findKota(inputKode, kode, kota);

        // Menampilkan hasil
        if (namaKota != null) {
            System.out.println("Kota untuk kode plat " + inputKode + " adalah: " + namaKota);
        } else {
            System.out.println("Kode plat tidak ditemukan.");
        }

        scanner.close();
    }

    private static String findKota(String kodePlat, String[] kode, String[][] kota) {
        // Mencari indeks dari kode plat
        for (int i = 0; i < kode.length; i++) {
            if (kode[i].equals(kodePlat)) {
                // Mengembalikan nama kota yang bersesuaian
                return kota[i][0]; // Mengambil kota dari kolom pertama
            }
        }
        return null; // Jika tidak ditemukan
    }
}