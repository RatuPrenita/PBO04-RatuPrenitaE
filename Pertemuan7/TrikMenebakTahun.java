
package Pertemuan7;

import java.util.Scanner;

class TebakL{
    int hitung(int bulan, int tanggal, int tahun){
        return ((bulan*2+5)*50)+tanggal+tahun;
    }
    int tebak(int hasil,int tahun){
        return hasil-250-tahun;
    }
}
public class TrikMenebakTahun{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Bulan Lahir : ");
        int bulan = s.nextInt();
        System.out.print("Tanggal Lahir : ");
        int tanggal = s.nextInt();
        System.out.print("Tahun Lahir : ");
        int tahun = s.nextInt();
        
        TebakL tl = new TebakL();
        int hasilP= tl.hitung(bulan, tanggal, tahun);
        System.out.println("Hasil Hitung Pemain : "+hasilP);
        
        int hasil =tl.tebak(hasilP,tahun);
        System.out.println("Haisl akhir : "+hasil);
        System.out.println("Tebak bulan "+(hasil/100)+",tanggal "+(hasil%100)+",tahun "+tahun);
    }
    
}
