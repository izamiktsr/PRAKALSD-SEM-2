package Jobsheet2;
public class MahasiswaMain18 {

    public static void main(String[] args) {
        Mahasiswa18 mhs1 = new Mahasiswa18();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "244120171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi ();
        mhs1.ubahKelas ("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();
    
        Mahasiswa18 mhs2 = new Mahasiswa18("Annisa Nabila","2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa18 mhs3 = new Mahasiswa18("Syahfrizam Ikmal Kautsar", "244107060134", 3.13, "TI 2M");
        mhs3.tampilkanInformasi();
        mhs3.updateIpk(3.75);
        mhs3.tampilkanInformasi();
    }
}
