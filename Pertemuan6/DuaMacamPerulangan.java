package Pertemuan6;

public class DuaMacamPerulangan{
    public static void main(String[] args){
        Perulangan pr = new Perulangan();
        pr.perulangan();
    }
}

class Perulangan{
    void perulangan(){
        int[] age = {12, 4, 5, 2, 6};

        System.out.println("For:");
        for (int i = 0; i < age.length; i++){
          System.out.print(age[i]+" ");
        }
        System.out.println("\nFor-each :");
        for (int a : age) {
          System.out.print(a+" ");
        }
        System.out.println();
    }
}