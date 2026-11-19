package Pertemuan6;

public class MewarisiThread{
    public static void main(String[]args){
        ThreadBaru tred = new ThreadBaru();
        tred.start();
        System.out.println("Thread utama selesai");
    }
}
class ThreadBaru extends Thread{
    @Override
    public void run() {
        for (int i=1; i<=5; i++) {
            System.out.println("Thread baru : "+i);
        }
    }
}