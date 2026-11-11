
package Pertemuan5;

import java.util.Scanner;

public class MenampilkanAngkaGanjil {
    public static void main(String[] args) {
        Ganjil gjl=new Ganjil();
        Scanner s=new Scanner(System.in);
        System.out.print("masukan banyak angka ganjil: ");
        gjl.n=s.nextInt();
        gjl.cekganjil();
    }
}
class Ganjil{
    int n;
    
    void cekganjil(){for(int i=1; i<=n*2;i++){
            if(i%2==1){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("Total Penjumlahan = "+ (n*n));
    }
}