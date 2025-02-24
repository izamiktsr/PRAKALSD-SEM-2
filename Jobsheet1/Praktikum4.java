package Jobsheet1;
public class Praktikum4 {

    // Harga per jenis bunga
    private static final int HARGA_AGLONEMA = 75000;
    private static final int HARGA_KELADI = 50000;
    private static final int HARGA_ALOCASIA = 60000;
    private static final int HARGA_MAWAR = 10000;

    // Stok bunga di setiap cabang
    private static int[][] stok = {
        {10, 5, 15, 7},  // RoyalGarden 1
        {6, 2, 11, 12},  // RoyalGarden 2
        {3, 9, 5, 10},   // RoyalGarden 3
        {5, 7, 12, 9}    // RoyalGarden 4
    };

    public static void main(String[] args) {
        // Menampilkan pendapatan setiap cabang
        System.out.println("Pendapatan setiap cabang ketika stok bunga habis:");
        tampilkanPendapatan();

        // Mengurangi stok bunga
        int[][] penguranganStok = {
            {-1},  // Aglonema
            {-2},  // Keladi
            {0},   // Alocasia
            {-5}   // Mawar
        };

        kurangiStok(penguranganStok);
        
        // Menampilkan stok setelah pengurangan
        System.out.println("\nStok bunga setelah pengurangan:");
        tampilkanStok();
    }

    public static void tampilkanPendapatan() {
        // Menghitung dan menampilkan pendapatan tiap cabang
        for (int i = 0; i < stok.length; i++) {
            int totalPendapatan = (stok[i][0] * HARGA_AGLONEMA)
                                + (stok[i][1] * HARGA_KELADI)
                                + (stok[i][2] * HARGA_ALOCASIA)
                                + (stok[i][3] * HARGA_MAWAR);
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + totalPendapatan);
        }
    }

    public static void kurangiStok(int[][] penguranganStok) {
        // Mengurangi stok sesuai data yang diberikan
        for (int i = 0; i < stok.length; i++) {
            for (int j = 0; j < penguranganStok.length; j++) {
                stok[i][j] += penguranganStok[j][0];
            }
        }
    }

    public static void tampilkanStok() {
        // Menampilkan stok yang tersisa untuk setiap cabang
        for (int i = 0; i < stok.length; i++) {
            System.out.print("RoyalGarden " + (i + 1) + ": ");
            for (int j = 0; j < stok[i].length; j++) {
                System.out.print(stok[i][j] + " ");
            }
            System.out.println();
        }
    }
}