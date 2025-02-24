package Jobsheet2;
public class MatakuliahMain18 {
    public static void main(String[] args) {
        Matakuliah18 mk1 = new Matakuliah18();
        mk1.tampilInformasi();
        mk1.ubahSKS(3);
        mk1.tambahJam(2);
        mk1.kurangJam(1);
        mk1.tampilInformasi();

        Matakuliah18 mk2 = new Matakuliah18("IF123", "Pemrograman Java", 4, 6);
        mk2.tampilInformasi();
        mk2.ubahSKS(5);
        mk2.tambahJam(3);
        mk2.kurangJam(4);
        mk2.tampilInformasi();
    }
}
