package pertemuan3;

import java.util.Scanner;

public class hitung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Massa: ");
        double massa = input.nextDouble();
        System.out.print("Kecepatan: ");
        double kec = input.nextDouble();
        System.out.print("Jari-jari: ");
        double jr = input.nextDouble();
        
        Double f = (massa * kec * kec)/jr;

        System.out.println("Gaya Sentripetal : " +f+ " N");
    }
}