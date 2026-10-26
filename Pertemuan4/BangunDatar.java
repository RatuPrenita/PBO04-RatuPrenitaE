
package Pertemuan4;

import java.util.Scanner;

public class BangunDatar {
    public static void main(String[] args) {
      LuasBangunD lb = new LuasBangunD(); 
      Scanner s = new Scanner(System.in);
      
        System.out.println("1. Hitung Luas Persegi");
        System.out.println("2. Hitung Luas Segitiga");
        System.out.println("3. Hitung Luas Lingkaran");
        System.out.println("4. Hitung Luas Trapesium");
        System.out.println("5. Hitung Luas Layang-Layang");
        System.out.print("Masukan Pilihan : ");
        lb.pilih = s.nextInt();
        
        switch(lb.pilih){
            case 1 :
                System.out.print("Nilai sisi : ");
                lb.sisi = s.nextInt();
                System.out.println("Hasil "+ (lb.sisi*lb.sisi));
                break;
            case 2 :
                System.out.print("Nilai alas : ");
                lb.alas = s.nextInt();
                System.out.print("Nilai tinggi : ");
                lb.tinggi = s.nextInt();
                System.out.println("Hasil " + (0.5* lb.alas * lb.tinggi));
                break;
            case 3 :
                System.out.print("Nilai Jari-jari : ");
                lb.jari = s.nextInt();
                System.out.println("Hasil "+ (3.14* lb.jari * lb.jari));
                break;
            case 4 :
                System.out.print("Nilai Sejajar 1 : ");
                lb.s1 = s.nextInt();
                System.out.print("Nilai Sejajar 2 : ");
                lb.s2 = s.nextInt();
                System.out.print("Nilai Tinggi");
                lb.tinggi = s.nextInt();
                System.out.println("Hasil "+ (0.5 * lb.s1 * lb.s2 * lb.tinggi));
                break;
            case 5 :
                System.out.print("Nilai d1 : ");
                lb.d1 = s.nextInt();
                System.out.print("Nilai d2 : ");
                lb.d2 = s.nextInt();
                System.out.println("Hasil "+ (0.5 * lb.d1 * lb.d2));
        }
    }
}

class LuasBangunD{
    int jari, alas, tinggi, sisi, pilih;
    int s1 , s2;
    int d1, d2;
}