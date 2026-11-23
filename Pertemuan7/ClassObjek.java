
//Class berfungsi sebagai rancangan atau cetak biru yang mendefinisikan struktur 
//data (atribut/variabel) dan perilaku (method/fungsi).

//Proses Instansiasi (Instantiation) adalah proses menciptakan objek nyata dari class 
//tersebut di memori saat program dijalankan (misalnya dengan kata kunci new di Java,
//atau deklarasi variabel bertipe class di C++).

//Object adalah wujud nyata dari class yang memiliki nilai atributnya sendiri 
//dan bisa menjalankan method milik class.

package Pertemuan7;
class Mahasiswa{

    String nama,npm,jurusan;
    Mahasiswa(String nama, String npm, String jurusan){
        this.nama = nama;
        this.npm = npm;
        this.jurusan = jurusan;
    }
    void belajar(){
        System.out.println(nama+ " Mahasiswa sedang belajar");
    }
}

public class ClassObjek{
    public static void main(String[] args){
        Mahasiswa m1= new Mahasiswa("Ratu", "7689564", "TI");
        Mahasiswa m2= new Mahasiswa("Joss", "983265", "TI");

        m1.belajar();
        m2.belajar();
    }
}
