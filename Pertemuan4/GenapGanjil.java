
package Pertemuan4;

import java.util.Scanner;

public class GenapGanjil {
    public static void main(String[] args) {
       Bilangan b = new Bilangan();
       Scanner s = new Scanner(System.in);
       
        System.out.print("Bilangan : ");
        b.bil = s.nextInt();
        
        if(b.bil % 2 == 0){
            System.out.println(b.bil + " adalah bilangan Genap");
        }else {
            System.out.println(b.bil + " adalah bilangan Ganjil");
        }
    }
}

class Bilangan {
    int bil;
}

//public class GenapGanjil {
//    public static void main(String[] args) {
//       Scanner s = new Scanner(System.in);
//       int bil;
//       
//        System.out.print("Bilangan : ");
//        bil = s.nextInt();
//        
//        if(bil % 2 == 0){
//            System.out.println(bil + " adalah bilangan Genap");
//        }else {
//            System.out.println(bil + " adalah bilangan Ganjil");
//        }
//    }
//}