
package Pertemuan4;

import java.util.Scanner;

public class GajiPegawai {
    public static void main(String[] args) {
        Gaji g = new Gaji();
        Scanner s = new Scanner(System.in);
        
        System.out.println("Masukkan NIK : ");
        g.nik = s.nextLine();
        
        System.out.println("Masukan nama : ");
        g.nama = s.nextLine();
        
        System.out.println("1. Menikah : ");
        System.out.println("2. Belum menikah : ");
        System.out.println("3. Cerai : ");
        System.out.println("4. Menikah dan punya anak : ");
        System.out.println("Masukan kode Keterangan : ");
        g.pilih = s.nextInt();
        
        System.out.println("Masukan jumlah anak : ");
        g.jmlAnak = s.nextInt();
        
        switch(g.pilih){
            case 1 :
                g.gapok = 1200000;
                g.status = "Menikah";
                break;
            case 2 :
                g.gapok = 1500000;
                g.status = "Belum mnikah";
                break;
            case 3 :
                g.gapok = 1750000;
                g.status = "Cerai";
                break;
            case 4 :
                g.gapok = 2000000;
                g.status = "Menikah dan punya anak";
                break;
            default :
                System.out.println("Kode keterangan tidak valid!");
                return;
        }
        
        g.gajiBersih = g.gapok * g.totTun;
        g.totTun = g.tunPas * g.tunAnk;
        g.tunPas = 0.10 * g.gapok;
        g.tunAnk = 0.05 * g.gapok * g.jmlAnak;
        
        System.out.println("NIK : "+g.nik);
        System.out.println("Nama : "+g.nama);
        System.out.println("Status : "+g.status);
        System.out.println("Jumlah Anak : "+g.jmlAnak);
        System.out.println("Gaji Pokok : "+ g.gapok);
        System.out.println("Tunjangan Pasangan: "+ g.tunPas);
        System.out.println("Tunjangan Anak : "+g.tunAnk);
        System.out.println("Total Tunjangan : "+g.totTun);
        System.out.println("Gaji bersih : "+g.gajiBersih);
    }
}

class Gaji {
    String nik, nama;
    int pilih,jmlAnak;
    double  gapok = 0;
    String status = "";
    double tunPas, tunAnk, totTun, gajiBersih;

}