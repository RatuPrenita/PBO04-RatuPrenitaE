package pertemuan3;

import java.io.*;

public class Pembelanjaan {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataOutputStream output = new DataOutputStream(
                new FileOutputStream("belanja.dat")
        );

        output.writeUTF("Ratu");        
        output.writeFloat(300000);     
        output.writeInt(25);           
        output.writeFloat(255000);     
        output.close();

        DataInputStream input = new DataInputStream(
                new FileInputStream("belanja.dat")
        );
        String nama = input.readUTF();
        float totbel = input.readFloat();
        int diskon = input.readInt();
        float byr = input.readFloat();


        float ttl = totbel-(totbel*diskon/100);
        float kembalian=byr-ttl;

        System.out.println("Nama          : " + nama);
        System.out.println("Total Belanja : " + totbel);
        System.out.println("Diskon (%)    : " + diskon);
        System.out.println("Total         : " + ttl);
        System.out.println("Bayar         : " + byr);
        System.out.println("Kembalian     : " + kembalian);
    }
}