package Pertemuan7;
import java.util.Scanner;

class Data{
    String nama,npm,kelas;
    Data(String nama, String npm, String kelas){
        this.nama=nama;
        this.npm=npm;
        this.kelas=kelas;
    }
    void menampilkan(){
        System.out.println("\nNama : "+this.nama);
        System.out.println("Npm : "+this.npm);
        System.out.println("Kelas : "+this.kelas);
    }
}
public class InputNamaNpmKelas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan Nama : ");
        String nama = s.nextLine();
        System.out.print("Masukan NPM : ");
        String npm = s.nextLine();
        System.out.print("Masukan Kelas : ");
        String kelas = s.nextLine();
        Data m = new Data(nama,npm,kelas);
        m.menampilkan();
    }
}
