package Kuis1Sem2;
public class mahasiswamain18 {
    public static void main(String[] args) {
        mahasiswa18[] arrayMahasiswa = new mahasiswa18[10];

        // Contoh pengisian data mahasiswa
        arrayMahasiswa[0] = new mahasiswa18("101", "Ani", "TI", 3.5f);
        arrayMahasiswa[1] = new mahasiswa18("102", "Budi", "SI", 3.7f);
        // Tambahkan data mahasiswa lainnya...

        DataMahasiswa18 dataMahasiswa = new DataMahasiswa18(arrayMahasiswa);
        
        // Menampilkan jumlah mahasiswa
        System.out.println("Jumlah Mahasiswa: " + dataMahasiswa.jumlahMahasiswa());
        
        // Mencari mahasiswa program studi TI
        dataMahasiswa.cariMahasiswa("TI");

        // Menampilkan IPK tertinggi
        System.out.println("IPK Tertinggi: " + dataMahasiswa.ipkTertinggi());
    }
}