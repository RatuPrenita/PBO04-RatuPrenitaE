package Pertemuan6;

public class MenampungData{
    public static void main(String[] args) {
        TampData td = new TampData();
        td.data();
    }
}

class TampData{
    void data(){
        Object[] data = {19, 0.2, 'C', "Java", true};
        for (Object y : data){ 
            System.out.println(y);
        }
    }
}