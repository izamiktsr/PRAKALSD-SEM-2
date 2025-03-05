package Kuis1Sem2;
public class DataMahasiswa18 {
    private mahasiswa18[] dataSemuaMahasiswa;

    public DataMahasiswa18(mahasiswa18[] arrayMahasiswa) {
        this.dataSemuaMahasiswa = arrayMahasiswa;
    }

    // Menghitung jumlah mahasiswa
    public int jumlahMahasiswa() {
        return dataSemuaMahasiswa.length;
    }

    // Mencari mahasiswa berdasarkan Program Studi
    public void cariMahasiswa(String programStudi) {
        System.out.println("Mahasiswa di Program Studi " + programStudi + ":");
        for (mahasiswa18 mahasiswa : dataSemuaMahasiswa) {
            if (mahasiswa.getProgramStudi().equalsIgnoreCase(programStudi)) {
                mahasiswa.cetakData();
            }
        }
    }

    // Mengambil IPK tertinggi
    public float ipkTertinggi() {
        float ipkMax = 0;
        for (mahasiswa18 mahasiswa : dataSemuaMahasiswa) {
            if (mahasiswa.getIPK() > ipkMax) {
                ipkMax = mahasiswa.getIPK();
            }
        }
        return ipkMax;
    }
}