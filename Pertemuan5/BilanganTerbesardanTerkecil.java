package Pertemuan5;

import java.util.Scanner;

public class BilanganTerbesardanTerkecil {
    public static void main(String[] args) {
     Bilangan bl = new Bilangan();
     Scanner s = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + " : ");
            bl.a[i] = s.nextInt();
        }

       bl.mengecek();
    }
}

class Bilangan {
    int[] a = new int[10];

    void mengecek() {
        int terbesar = a[0];
        int terkecil = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > terbesar) {
                terbesar = a[i];
            }
            if (a[i] < terkecil) {
                terkecil = a[i];
            }
        }

        System.out.println(terbesar + "ini bilangan terbesar");
        System.out.println(terkecil + "ini bilangan terkecil");
    }
}