
package Pertemuan4;

import java.util.Scanner;

public class KomisiSalesman {
    public static void main(String[] args) {
        Salesman k = new Salesman();
        Scanner s = new Scanner(System.in);
        
        System.out.print("Total penjualan hari ini : ");
        k.penjualan = s.nextInt();
        
        if(k.penjualan <= 2000000){
           k.uang = 100000;
           k.komisi = 0.10 * k.penjualan;
        }else if(k.penjualan <= 5000000){
           k.uang = 200000;
           k.komisi = 0.15 * k.penjualan;
        }else {
           k.uang = 300000;
           k.komisi = 0.20 * k.penjualan;
        }
        
        k.totpen = k.uang + k.komisi;
        
        System.out.println("Total penjualan :"+k.penjualan);
        System.out.println("Uang jasa : "+ k.uang);
        System.out.println("Uang komisi : "+ k.komisi);
        System.out.println("Total pendapatan: "+ k.totpen);
        
    }
}

class Salesman{
    double uang, komisi, penjualan, totpen;
}