
package Pertemuan4;

import java.util.Scanner;

public class DiskonMember {
    public static void main(String[] args) {
        Member m = new Member();
        Scanner s = new Scanner(System.in);
        
        System.out.println("Apakah kamu memiliki member : ");
        m.member = s.next().charAt(0);
        
        System.out.println("Belanja berapa : ");
        m.totbelanja = s.nextInt();
        
        if (m.member == 'y' || m.member == 'Y') {
            if(m.totbelanja > 500000){
                m.diskon = 50000;
            }else if(m.totbelanja >100000){
                m.diskon = 15000;
            }
        } else{
            if(m.totbelanja > 100000){
                m.diskon = 10000;
            }
        }
        
        m.totbayar = m.totbelanja - m.diskon;
        
        System.out.println("Uang yang di berikan : ");
        m.uang = s.nextInt();
        
        if(m.uang >= m.totbayar){
            m.kembali = m.uang - m.totbayar;
            
            System.out.println("Total Belanja : "+ m.totbelanja);
            System.out.println("Diskon  : "+ m.diskon);
            System.out.println("Total Bayar: "+ m.totbayar);
            System.out.println("Uang yang di berikan : "+ m.uang);
            System.out.println("Kembalian : "+ m.kembali);
        }
        
        
    }
}

class Member {
    char member;
    int uang, kembali, totbayar, diskon, totbelanja;;
    
}