package pertemuan3;

import java.util.Scanner;

public class Percetakan{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Jumlah novel : ");
        int n = in.nextInt();

        System.out.print("Tebal per novel : ");
        int l = in.nextInt();

        int totDetik = n * l;
        
        int Mnt = (totDetik %3600) /60;
        int Hr = totDetik/86400;
        int Dtk = totDetik %60;
        int Jm = (totDetik %86400) /3600;
        

        System.out.println("Diperlukan Waktu : " + Hr + " hari " + Jm + " jam "
                + Mnt + " menit " + Dtk + " detik");
    }
}