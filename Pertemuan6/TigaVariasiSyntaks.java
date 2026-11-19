package Pertemuan6;

public class TigaVariasiSyntaks{

    void tigaVariasi(){
        int[] Var1 = {8, 14, 20, 28, 34};
        int[] Var2 = new int[]{51,55,62,66,71,77,80};
        
        int Var3[] = new int[3];
        Var3[0] = 36;
        Var3[1] = 41;
        Var3[2] = 47;

    System.out.println("Array 1");
    for(int n : Var1){
        System.out.print(n + " ");
    }
    System.out.println("\nArray 2");
    for(int n : Var2){
        System.out.print(n + " ");
    }
    System.out.println("\nArray 3");
    for(int i = 0; i < Var3.length; i++){
        System.out.print(Var3[i] + " ");
    }
        System.out.println();
    }
}