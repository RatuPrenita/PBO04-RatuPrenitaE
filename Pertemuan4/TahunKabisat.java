
package Pertemuan4;

import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Kabisat k = new Kabisat();
        
        System.out.print("Masukan tahun : ");
        k.tahun = s.nextInt();
        
        if((k.tahun %4 == 0 && k.tahun%100 != 0) || (k.tahun %400 == 0)){
            System.out.println("adalah Tahun kabisat");
        }else{
            System.out.println("Bukan Tahun Kabisa");
        }
    }
 
}

class Kabisat{
    int tahun;
}