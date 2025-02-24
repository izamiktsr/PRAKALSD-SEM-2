package Jobsheet1;
import java.util.Scanner;
public class Praktikum1 {
public static void Praktikum1() {
    Scanner keyNilai = new Scanner(System.in);
    float nAkhir=0, nTugas=0, nKuis=0, nUTS=0, nUAS=0, nSetara=0;
    String nHuruf, kualifikasi, keterangan;
    boolean valid=false;
    
    while (!valid) {
        System.out.print("Masukkan Nilai Tugas  : "); nTugas  = keyNilai.nextFloat();
        System.out.print("Masukkan Nilai Kuis   : "); nKuis  = keyNilai.nextFloat();
        System.out.print("Masukkan Nilai UTS    : "); nUTS  = keyNilai.nextFloat();
        System.out.print("Masukkan Nilai UAS    : "); nUAS  = keyNilai.nextFloat();
        valid = true;
        if (nTugas<0 || nTugas>100) {
            valid = false;
            System.out.println("Nilai Tugas tidak valid "); 
        }
        if (nKuis<0 || nKuis>100) {
            valid = false;
            System.out.println("Nilai Kuis tidak valid "); 
        }
        if (nUTS<0 || nUTS>100) {
            valid = false;
            System.out.println("Nilai UTS tidak valid "); 
        }
        if (nUAS<0 || nUAS>100) {
            valid = false;
            System.out.println("Nilai UAS tidak valid "); 
        }
    }
    
    nAkhir =  (float) (nTugas*0.1+nKuis*0.2+nUTS*0.3+nUAS*0.4);
    if (nAkhir>80) {
        nHuruf = "A";
        nSetara = 4;
        kualifikasi = "Sangat Baik";
        keterangan = "LULUS";
    } else if (nAkhir>73) {
        nHuruf = "B+";
        nSetara = (float) 3.5;
        kualifikasi = "Lebih dari Baik";
        keterangan = "LULUS";
    } else if (nAkhir>65) {
        nHuruf = "B";
        nSetara = 3;
        kualifikasi = "Baik";
        keterangan = "LULUS";
    } else if (nAkhir>60) {
        nHuruf = "C+";
        nSetara = (float) 2.5;
        kualifikasi = "Lebih dari Cukup";
        keterangan = "LULUS";
    } else if (nAkhir>50) {
        nHuruf = "C";
        nSetara = 2;
        kualifikasi = "Cukup";
        keterangan = "LULUS";
    } else if (nAkhir>39) {
        nHuruf = "D";
        nSetara = 1;
        kualifikasi = "Kurang";
        keterangan = "TIDAK LULUS";
    } else {
        nHuruf = "E";
        nSetara = 0;
        kualifikasi = "Gagal";
        keterangan = "TIDAK LULUS";
    }
    
    System.out.println("Nilai Akhir : "+ nAkhir);
    System.out.println("Nilai Huruf : "+ nHuruf);
    System.out.println("Kualifikasi : "+ kualifikasi);
    System.out.println("Keterangan  : "+ keterangan);
}


public static void main(String[] args) {
    // TODO code application logic here
    
    Praktikum1();
}
}