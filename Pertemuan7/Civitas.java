package Pertemuan7;

class Dosen{
    String nama,status;
    Dosen(String nama, String status){
        this.nama= nama;
        this.status= status;
    }
}
class Mahasiswa {
    String nama,status;

    Mahasiswa(String nama,String status){
        this.nama= nama;
        this.status= status;
    }
}
class Staff{
    String nama,status;

    Staff(String nama,String status){
        this.nama= nama;
        this.status= status;
    }
}
class Civ{
    Dosen d;
    Mahasiswa m;
    Staff s;

    Civ(Dosen dsn,Mahasiswa mhs,Staff stf){
        this.d =dsn;
        this.m=mhs;
        this.s=stf;
    }
    void info(){
        System.out.println("Civitas Fakultas Teknik");
        System.out.println("Nama : " +d.nama);
        System.out.println("Status : " +d.status);
        System.out.println("\nNama : " +m.nama);
        System.out.println("Status : " + m.status);
        System.out.println("\nNama : " +s.nama);
        System.out.println("Status : " +s.status);  
    }
}
public class Civitas{
    public static void main(String[] args){
        Dosen dsn = new Dosen("Bunda","Dosen");
        Mahasiswa mhs = new Mahasiswa("Ratu","Mahasiswa");
        Staff stf = new Staff("Asep","Staff");

        Civ c = new Civ(dsn, mhs, stf);
        c.info();
    }
}
