
package pertemuan2;
public class HitungJarak {
    public static void main(String[] args) {
        float bulan = 384400;
        float matahari = 152100000;
        float kecepatan = 300000;
        
        System.out.println("Ke bulan "+(bulan/kecepatan));
        System.out.println("Ke matahari "+(matahari/kecepatan)+" detik dan "+(matahari/kecepatan/60)+" menit");
        
    }
}
