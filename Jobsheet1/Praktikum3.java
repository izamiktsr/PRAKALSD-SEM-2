package Jobsheet1;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Praktikum3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat mapping nilai huruf ke nilai setara
        Map<String, Double> nilaiSetara = new HashMap<>();
        nilaiSetara.put("A", 4.0);
        nilaiSetara.put("B+", 3.5);
        nilaiSetara.put("B", 3.0);
        nilaiSetara.put("C+", 2.5);
        nilaiSetara.put("C", 2.0);
        nilaiSetara.put("D", 1.0);
        nilaiSetara.put("E", 0.0);

        // Meminta input jumlah mata kuliah
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = scanner.nextInt();
        scanner.nextLine(); // Konsumsi newline

        double totalNilai = 0;
        int totalSKS = 0;

        // Loop untuk input mata kuliah
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("\nMata Kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            String namaMatkul = scanner.nextLine();

            System.out.print("Bobot SKS: ");
            int sks = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            System.out.print("Nilai Huruf (A, B+, B, C+, C, D, E): ");
            String nilaiHuruf = scanner.nextLine().toUpperCase();

            // Validasi nilai huruf
            if (!nilaiSetara.containsKey(nilaiHuruf)) {
                System.out.println("Nilai huruf tidak valid. Silakan coba lagi.");
                i--; // Ulangi input untuk mata kuliah ini
                continue;
            }

            // Hitung total nilai
            double nilai = nilaiSetara.get(nilaiHuruf);
            totalNilai += nilai * sks;
            totalSKS += sks;
        }

        // Menghitung IP Semester
        double ipSemester = totalNilai / totalSKS;
        System.out.printf("\nIP Semester Anda: %.2f\n", ipSemester);

        scanner.close();
    }
}
