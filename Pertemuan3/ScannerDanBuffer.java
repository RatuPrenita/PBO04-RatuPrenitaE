
package Pertemuan3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


//Class Scanner digunakan untuk memindai tipe data primitif dan string dari aliran input. 
//Ini dapat membaca input dari berbagai sumber, termasuk System.in, file, atau string. 
//Namun, meskipun mudah digunakan, Scanner cenderung memiliki kinerja yang lebih lambat, 
//terutama dalam pembacaan input besar, karena melakukan parsing dan interpretasi data secara langsung
public class ScannerDanBuffer {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Scanner :");
        System.out.print("Nama : ");
        String nama1 = input.nextLine();
        
        System.out.print("Hobi : ");
        String hobi1= input.nextLine();
        
        System.out.println("Nama : "+nama1);
        System.out.println("Hobi : "+hobi1);
        
        
 //class BufferedReader lebih cocok untuk membaca input teks dari aliran input. 
 //Ini membaca data dalam jumlah besar sekaligus dan menyimpannya dalam buffer,
 //penggunaannya sedikit lebih rumit daripada Scanner.
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("");
        System.out.print("Buffered");
        System.out.print("Nama : ");
        String nama2 = in.readLine();
        
        System.out.print("Hobi : ");
        String hobi2 = in.readLine();
    
        System.out.println("Nama : "+nama2);
        System.out.println("Hobi : "+hobi2);
    }
}
