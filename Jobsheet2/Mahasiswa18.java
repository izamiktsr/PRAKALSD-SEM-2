package Jobsheet2;
public class Mahasiswa18 {


public Mahasiswa18() {
}

public Mahasiswa18 (String nm, String nim, double ipk, String kls) {
    nama = nm;
    this.nim = nim;
    this.ipk = ipk;
    kelas = kls;
}

    String nama,nim,kelas;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void ubahIPK(double ipkBaru) {
        ipk = ipkBaru;
    }   

    String nilaiKinerja () {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
            } else if (ipk >= 3.0) {
                return "Kinerja baik";
            } else if (ipk >= 2.0) {
                return "Kinerja cukup";
            } else {
                return "Kinerja kurang";
             }
            }

    public void updateIpk(double d) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateIpk'");
    }
        }