
package Pertemuan7;
import java.util.Scanner;

class Hitung{
    double panjang, lebar;
    
    Hitung(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    double Keliling() {
        return 2*(panjang+lebar);
    }
}

public class KelilingPersegiPanjang  {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Inputkan panjang : ");
        double pan = s.nextDouble();
        System.out.print("Inputkan lebar   : ");
        double leb = s.nextDouble();

        Hitung pl = new Hitung(pan,leb);

        System.out.println("Keliling persegi panjang = " + pl.Keliling());
    }
}
