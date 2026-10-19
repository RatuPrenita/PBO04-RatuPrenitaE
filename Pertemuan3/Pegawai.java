
package Pertemuan3;

import java.util.Scanner;
public class Pegawai {
    public static void main(String[] args) {
       Scanner r = new Scanner(System.in);
       
        System.out.print("Nomor Induk Karyawan : ");
        String nik = r.nextLine();
        
        System.out.print("Nama Karyawan : ");
        String nama = r.nextLine();
        
        System.out.print("Alamat : ");
        String alamat = r.nextLine();
        
        System.out.print("Jabatan : ");
        String jbtn = r.nextLine();
        
        System.out.print("Gaji Pokok : ");
        float r1 = r.nextFloat();
        
        System.out.print("Tunjangan Jabatan : ");
        float r2 = r.nextFloat();
        
        System.out.print("Tunjangan Istri : ");
        float r3 = r.nextFloat();
        
        System.out.print("Tunjangan Anak : ");
        float r4 = r.nextFloat();
      
        
        float totgj = r1 + r2 + r3 +r4;
        float pjk = 0.1f * (r1+r2+r4);
        float gjbersih = totgj - pjk;
        
        System.out.println();
        System.out.println("Nomor Induk Karyawan  : "+nik);
        System.out.println("Nama Karyawan  : "+nama);
        System.out.println("Alamat  : "+alamat);
        System.out.println("Jabatan : "+jbtn);
        System.out.println("Gaji Pokok  : "+r1);
        System.out.println("Tunjangan Jabatan : "+r2);
        System.out.println("Tunjangan Istri  : "+r3);
        System.out.println("Tunjangan Anak  : "+r4);
        System.out.println("Pajak Penghasilan : "+pjk);
        System.out.println("Gaji Bersih : "+gjbersih);
        
    }
}
