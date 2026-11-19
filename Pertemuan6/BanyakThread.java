package Pertemuan6;

public class BanyakThread{
    public static void main(String[] args) {
        int jumlah = 5;
        
        for (int i = 1; i <= jumlah; i++) {
            Mahasiswa mhs = new Mahasiswa(i);
            mhs.start();
        }
    }
}
class Mahasiswa extends Thread {
    int nomor;

    Mahasiswa(int nomor) {
        this.nomor=nomor;
    }
    @Override
    public void run() {
        for (int i=1; i<=2; i++) {
            System.out.println("Mahasiswa ke " +nomor+" : baris " +i);
        }
    }
}