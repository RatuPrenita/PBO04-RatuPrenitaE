
package Pertemuan7;
class Hitung {
    void hitMundur(int n){
        if (n==0) {
            return;
        }
        System.out.print(n+" ");
        hitMundur(n - 1);         
    }
}

public class Rekursif{
    public static void main(String[] args){
        Hitung r = new Hitung();
        r.hitMundur(5);
    }
}

