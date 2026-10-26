
package Pertemuan4;

import java.util.Scanner;


public class Hari {
    public static void main(String[] args) {
        PilihHari h = new PilihHari();
        Scanner s = new Scanner(System.in);
        
        System.out.println("Masukan Kode : ");
        h.kode = s.nextInt();
        
        switch (h.kode){
            case 1 : 
                System.out.println("Senin");
                break;
            case 2 :
                System.out.println("Selasa");
                break;
            case 3 :
                System.out.println("Rabu");
                break;
            case 4 : 
                System.out.println("Kamis");
                break;
            case 5 :
                System.out.println("Jumat");
                break;
            case 6 :
                System.out.println("Sabtu");
                break;
            case 7 :
                System.out.println("Minggu");
        }
        
    }
}

class PilihHari{
    int kode;
}