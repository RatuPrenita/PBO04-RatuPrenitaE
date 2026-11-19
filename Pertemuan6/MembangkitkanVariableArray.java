package Pertemuan6;
import java.util.Scanner;

public class MembangkitkanVariableArray {
    public static void main(String[] args) {
        Proses ps = new Proses();
        ps.hitung();
    }
}
class Proses{
    Scanner s = new Scanner(System.in);
    int n;
    void cekJml() throws Exception {
        if (n <= 0) {
            throw new Exception("elemen harus lebih dari 0");
        }
    }
    void hitung() {
        try {
            System.out.print("Masukkan jumlah elemen : ");
            n = s.nextInt();
            cekJml();

            int[] data = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Elemen ke-" + i + " : ");
                data[i] = s.nextInt();
            }
            int besar = data[0], kecil = data[0];
            int idxBesar = 0, idxKecil = 0;
            for (int i = 1; i < n; i++) {
                if (data[i] > besar) {
                    besar = data[i];
                    idxBesar = i;
                }
                if (data[i] < kecil) {
                    kecil = data[i];
                    idxKecil = i;
                }
            }
            System.out.println("\nNilai terbesar : " + besar + " (indeks " + idxBesar + ")");
            System.out.println("Nilai terkecil : " + kecil + " (indeks " + idxKecil + ")");

            int jml = 0;
            for (int a : data) {
                jml += a;
            }
            double r = (double) jml/n;
            System.out.println("Jumlah semua : " + jml);
            System.out.println("Rata-rata    : " + r);

            int ganjil = 0, genap = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    genap += data[i];
                } else {
                    ganjil += data[i];
                }
            }
            System.out.println("Jumlah indeks ganjil : " +ganjil);
            System.out.println("Jumlah indeks genap  : " +genap);

            System.out.print("Masukkan angka terakhir NPM : ");
            int npm = s.nextInt();
            int hsl = (npm % 2==0) ? ganjil : genap;

            if (hsl % 2 == 0) {
                System.out.println("Hasil penjumlahan " +hsl+ " bernilai GENAP");
            } else {
                System.out.println("Hasil penjumlahan " +hsl+ " bernilai GANJIL");
            }

            for (int i=0; i <n-1; i++) {
                for (int j=0; j <n-1-i; j++) {
                    if (data[j] >data[j + 1]) {
                        int temp =data[j];
                        data[j] =data[j + 1];
                        data[j + 1] = temp;
                    }
                }
            }
            System.out.println("Array setelah diurutkan");
            for (int y : data){
                System.out.print(y + " ");
            }
            System.out.println();

        }catch (Exception e) {
            System.out.println("Input harus berupa angka bulat!");
        }finally {
            System.out.println("Program selesai");
        }
    }
}