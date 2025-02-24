package Jobsheet1;
import java.util.Scanner;

public class Tugas2 {
    
    // Fungsi untuk menghitung kecepatan
    public static double hitungKecepatan(double jarak, double waktu) {
        return jarak / waktu;
    }

    // Fungsi untuk menghitung jarak
    public static double hitungJarak(double kecepatan, double waktu) {
        return kecepatan * waktu;
    }

    // Fungsi untuk menghitung waktu
    public static double hitungWaktu(double jarak, double kecepatan) {
        return jarak / kecepatan;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi (1-4): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jarak (meter): ");
                    double jarak = scanner.nextDouble();
                    System.out.print("Masukkan waktu (detik): ");
                    double waktu = scanner.nextDouble();
                    double kecepatan = hitungKecepatan(jarak, waktu);
                    System.out.println("Kecepatan: " + kecepatan + " m/s");
                    break;

                case 2:
                    System.out.print("Masukkan kecepatan (m/s): ");
                    kecepatan = scanner.nextDouble();
                    System.out.print("Masukkan waktu (detik): ");
                    waktu = scanner.nextDouble();
                    jarak = hitungJarak(kecepatan, waktu);
                    System.out.println("Jarak: " + jarak + " meter");
                    break;

                case 3:
                    System.out.print("Masukkan jarak (meter): ");
                    jarak = scanner.nextDouble();
                    System.out.print("Masukkan kecepatan (m/s): ");
                    kecepatan = scanner.nextDouble();
                    waktu = hitungWaktu(jarak, kecepatan);
                    System.out.println("Waktu: " + waktu + " detik");
                    break;

                case 4:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
            System.out.println();
        } while (pilihan != 4);

        scanner.close();
    }
}