
package Pertemuan3;

import java.util.Scanner;
public class SelisihWaktu {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        
        System.out.println("Waktu Per-1 :");
        System.out.print("Jam :");
        int jm = r.nextInt();
        System.out.print("Menit : ");
        int mnt = r.nextInt();
        System.out.print("Detik : ");
        int dtk= r.nextInt();
        
        System.out.println("Waktu ke-2 :");
        System.out.print("Jam :");
        int jam = r.nextInt();
        System.out.print("Menit : ");
        int menit = r.nextInt();
        System.out.print("Detik : ");
        int detik = r.nextInt();
        
        int w = (jm * 3600) + (mnt * 60) + dtk;
        int w1 = (jam * 3600) + (menit * 60) + detik;
        
        int selisih = w1 - w;
        
        int jam1 = selisih / 3600;
        int menit1 = (selisih % 3600) / 60;
        int detik1 = selisih % 60;
        
        System.out.println("Selisih Waktu "+jam1+" Jam "+menit1+" menit "+detik1+" detik");
    }
}
