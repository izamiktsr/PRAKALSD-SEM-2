package Kuis1Sem2;
public class mahasiswa18 {
    private String nim;
    private String nama;
    private String programStudi;
    private float ipk;

    // Konstruktor
    public mahasiswa18(String nim, String nama, String programStudi, float ipk) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
        this.ipk = ipk;
    }
    
    public String getProgramStudi() {
        return programStudi;
    }

    public float getIPK() {
        return ipk;
    }
    // Method untuk menampilkan data
    public void cetakData() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Program Studi: " + programStudi);
        System.out.println("IPK: " + ipk);
    }
}

