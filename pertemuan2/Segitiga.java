
package pertemuan2;

public class Segitiga {
    public static void main(String[] args) {
         
         int a = 6;
         int b = 8;
         
         double luas =0.5*a*b;
         double c = Math.sqrt((a * a)+(b * b));
         double kel = a+b+c;
         
         System.out.println("Luas segitiga : "+luas);
         System.out.println("\nNilai C = "+ c);
         System.out.println("Keliling segitiga = "+kel);
            
    }
 
}
