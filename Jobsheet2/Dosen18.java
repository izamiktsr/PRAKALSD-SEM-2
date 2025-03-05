package Jobsheet2;
public class Dosen18 {
    
        String idDosen;
        String nama;
        boolean statusAktif;
        int tahunBergabung;
        String bidangKeahlian;

        public Dosen18() {
            this.idDosen = "Belum Ditemukan";
            this.nama = "Belum Ditemukan"; 
            this.statusAktif = false;
            this.tahunBergabung = 0;
            this.bidangKeahlian = "Belum Ditentukan";
    }

    public Dosen18(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) { 
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    public void tampilInformasi() {
        System.out.println("ID DOSEN: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("-------------------------------");
    }

    public void setStatusAktif(boolean status) {
        statusAktif = status;
        System.out.println("Status dosen telah diubah menjadi: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }

    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    public void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}
