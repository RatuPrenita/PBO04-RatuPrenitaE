package Pertemuan6;

import java.util.Scanner;

public class PenjumlahanMatriks{
    public static void main(String[] args) {
        Penjumlahan pm = new Penjumlahan();
        pm.Matriks();
    }
}

class Penjumlahan{
    Scanner s = new Scanner(System.in);
    void Matriks(){
        try{
            System.out.print("Jumlah baris : ");
            int brs = s.nextInt();
            System.out.print("Jumlah kolom : ");
            int klm = s.nextInt();

            int[][] Matriks1 = new int[brs][klm];
            int[][] Matriks2 = new int[brs][klm];
            int[][] jml = new int[brs][klm];

            System.out.println("Matriks 1");
            for(int i=0; i<brs; i++){
                for(int j=0; j<klm; j++){
                    System.out.print("Baris "+i+" kolom "+j+" = ");
                    Matriks1[i][j]=s.nextInt();
                }
            }
            System.out.println("Matriks 2");
            for(int i = 0; i < brs; i++){
                for(int j = 0; j < klm; j++){
                    System.out.print("Baris " + i + " kolom " + j + " = ");
                    Matriks2[i][j] = s.nextInt();
                }
            }
             for(int i = 0; i < brs; i++){
              for(int j = 0; j < klm; j++){
                 jml[i][j] = Matriks1[i][j]+Matriks2[i][j];
                }
            }
            System.out.println("Hasil penjumlahan");
            for(int[] n : jml){
                for(int i : n){
                    System.out.print(i + " ");
                }
            System.out.println();
            }
        }catch(Exception e){
            System.out.println("Input harus angka!");
        }
    }
}