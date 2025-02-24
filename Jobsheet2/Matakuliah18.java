package Jobsheet2;
public class Matakuliah18 {
    
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public Matakuliah18() {
        this.kodeMK = "Belum Ditentukan";
        this.nama = "Belum Ditentukan";
        this.sks = 0;
        this.jumlahJam = 0;
}

    public MataKuliah18( String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
}

void tampilInformasi() {
    System.out.println("Kode Mata Kuliah : " + kodeMK);
    System.out.println("Nama Mata Kuliah : " + nama);
    System.out.println("SKS: " + sks);
    System.out.println("Jumlah Jam: " + jumlahJam);
    System.out.println("-------------------------");
}
void ubahSKS(int sksBaru) {
    sks = sksBaru;
    System.out.println("SKS berhasil diubah menjadi " + sks);
}

void tambahJam(int jam) {
    jumlahJam += jam;
    System.out.println("Jumlah jam bertambah menjadi: " + jumlahJam);
}

void kurangiJam(int jam) {
    if (jumlahJam >= jam) {
        jumlahJam -= jam;
        System.out.println("Jumlah jam berhasil dikurangi menjadi: " + jumlahJam);
        } else {
            System.out.println("Jumlah jam tidak cukup untuk dikurangi");
        }
    }
}
