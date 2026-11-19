package Pertemuan6;
public class UbahNilaiArray {
    public static void main(String[] args) {
        merekMobil m = new merekMobil();
        m.mobil();
    }
}

class merekMobil {
    void mobil() {
    String[] merkMbl = {"Tesla","Suzuki","Civic","Mazda","BMW"};
        for (int i = 0; i < merkMbl.length; i++) {
         if (merkMbl[i].equals("Suzuki")) {merkMbl[i] = "Buggati";
         System.out.println("Indeks ke-" +i+ " diubah jadi : "+merkMbl[i]);
        }
      }
     for (String mbl : merkMbl) {
     System.out.println("Mobil : " + mbl);
     }
   }
}