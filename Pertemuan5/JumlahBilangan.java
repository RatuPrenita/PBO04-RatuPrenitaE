package Pertemuan5;

import java.util.Scanner;

public class JumlahBilangan{
    public static void main(String[] args) {
        Hitung hit = new Hitung();
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan : ");
        hit.n = s.nextInt();

        for (int i = 1; i <= hit.n; i++) {
            System.out.print("Masukkan bilangan ke-" + i + " : ");
            hit.tot += s.nextInt();
        }
        hit.hasil();
    }
}

class Hitung {
    int n;
    int tot;
    void hasil() {
        double rata = (double) tot / n;
        System.out.println("Total :" + tot);
        System.out.println("Rata-rata :" + rata);
    }
}