package pertemuan3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HitungTotalBuah {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Mangga yang di beli: ");
        int m = Integer.parseInt(br.readLine());

        System.out.print("Mangga yang busuk: ");
        int b = Integer.parseInt(br.readLine());

        System.out.print("Tetangga: ");
        int t = Integer.parseInt(br.readLine());

        System.out.print("Jambu per tetangga: ");
        int jt = Integer.parseInt(br.readLine());

        int manggaBagus = m - b;
        int totJambu = t * jt;
        int totBuah = manggaBagus + totJambu;
      
        System.out.println("\nHasil :");
        System.out.println("Mangga : " + manggaBagus + " pcs");
        System.out.println("Jambu : " + totJambu + " pcs");
        System.out.println("Total buah yang dibeli : " + totBuah + " pcs");
    }
}