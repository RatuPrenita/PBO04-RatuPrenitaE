package Pertemuan6;
import java.util.Scanner;

public class NilaiRataRata{
    public static void main(String[] args) {
        NlRataRata nr = new NlRataRata();
        nr.inputBil();
    }
}
class NlRataRata {
    Scanner s = new Scanner(System.in);
    void inputBil() {
        try {
        System.out.print("Masukkan jumlah bilangan : ");
        int n = s.nextInt();
      
            double[] bilangan = new double[n];
            for(int i = 0; i < n; i++) {
                try {
                    System.out.print("Bilangan ke " + (i + 1) + " = ");
                    bilangan[i] = s.nextDouble();
                }catch (Exception e) {
                    System.out.println("Input bukan bilangan, silakan ulangi!");
                    s.next();
                    i--;
                }
            }
            double tot = 0;
            for (double b : bilangan) {
                tot += b;
            }
            System.out.println("Rata-rata : " + (tot/n));
        }catch (Exception e) {
            System.out.println("Jumlah bilangan harus berupa angka bulat!");
        }finally {
            System.out.println("Program selesai");
        }
    }
}