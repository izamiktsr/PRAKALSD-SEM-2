package Jobsheet2;

public class DosenMain18 {
    public static void main(String[] args) {
    
        Dosen18 dsn1 = new Dosen18();
        dsn1.tampilInformasi();
        dsn1.setStatusAktif(true);
        dsn1.ubahKeahlian("Kecerdasan Buatan");
        System.out.println("Masa Kerja: " + dsn1.hitungMasaKerja(2025) + " tahun");
        dsn1.tampilInformasi();
    
        Dosen18 dsn2 = new Dosen18("D001", "Dr. Budi Santoso, true, 2012, "Pemrograman Java");
        dsn2.tampilInformasi();
        dsn2.setStatusAktif(false);
        dsn2.ubahKeahlian("Big Data");
        System.out.println("Masa Kerja: " + dsn2.hitungMasaKerja(2025) + " tahun");
        dsn2.tampilInformasi();
    }
    
