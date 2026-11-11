package Pertemuan5;

import java.util.Scanner;

public class Floydtriangle{
    public static void main(String[] args) {
        main floy = new main();
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan banyak baris : ");
        floy.banyak = s.nextInt();
        
        floy.menampilkan();
    }
}

class main {
    int banyak;
    void menampilkan() {
        int angka = 1;

        for (int i = 1; i <= banyak; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(angka + " ");
                
                angka++;
            }
            System.out.println();
        }
    }
}