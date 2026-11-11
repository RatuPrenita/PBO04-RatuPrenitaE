package Pertemuan5;

public class perulanganBintang {
    public static void main(String[] args) {
        Triangle tr = new Triangle();
        System.out.println("Half Triangle");
        tr.triangle1();
        System.out.println("\nFull Triangle");
        tr.triangle2();
    }
}

class Triangle {
    
    void triangle1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void triangle2() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 3; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i >= 1; i--) {
            for (int j = 3; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}