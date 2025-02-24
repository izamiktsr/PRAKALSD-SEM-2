package Jobsheet1;
import java.util.Scanner;

public class Praktikum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input NIM dari pengguna
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        // Mengambil 2 digit terakhir dari NIM
        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        // Jika n kurang dari 10, tambahkan 10
        if (n < 10) {
            n += 10;
        }

        // Menampilkan nilai n
        System.out.println("n = " + n);

        // Menampilkan output sesuai aturan
        System.out.print("OUTPUT: ");
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue; // Lewati angka 6 dan 10
            }
            if (i % 2 == 1) {
                System.out.print("* "); // Cetak * untuk angka ganjil
            } else {
                System.out.print(i + " "); // Cetak angka asli untuk angka genap
            }
        }
        scanner.close();
    }
}
