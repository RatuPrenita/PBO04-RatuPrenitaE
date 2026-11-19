package Pertemuan6;
import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        try {
            InputNl in = new InputNl();
            in.input();

            TampilNl t = new TampilNl();
            t.tampil(in);
        } catch (Exception e) {
            System.out.println("Input tidak valid, nilai yang di inputkan harus berupa angka!");
        }
    }
}
class InputNl {
    Scanner s = new Scanner(System.in);
    int n;
    String[] name;
    int[] grade;
    String[] status;

    void input(){
        System.out.print("Masukkan jumlah mahasiswa: ");
        n = s.nextInt();

       name = new String[n];
        grade = new int[n];
        status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Mahasiswa ke " + (i + 1));
            s.nextLine();
            System.out.print("Nama  : ");
            name[i] = s.nextLine();
            System.out.print("Nilai : ");
            grade[i] = s.nextInt();

            if (grade[i]<= 50) {
                status[i] = "Tidak Lulus";
            } else {
                status[i] = "Lulus";
            }
        }
    }
}
class TampilNl {
    void tampil(InputNl r) {
        System.out.println("\n          Daftar Nilai Mahasiswa              ");
        System.out.printf("%-5s%-20s%-10s%-15s%n", "No", "Nama", "Nilai", "Status");
    for (int i = 0; i < r.n; i++) {
            System.out.printf("%-5d%-20s%-10d%-15s%n", (i + 1),r.name[i],r.grade[i],r.status[i]);
        }
    }
}