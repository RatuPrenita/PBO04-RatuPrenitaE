
package pertemuan2;

public class KonversiSuhu {
    public static void main(String[] args) {
        
  double C = 10; 
  double F = 15;
  double R = 5;
   
        System.out.println("Celcius ke Fahrenheit dan sebaliknya:");
        System.out.println("Celsius "+ C +" ke Fahrenheit "+((C*9.0/5)+32));
        System.out.println("Fahrenheit "+ F +" ke Celcius "+((F-32)*9.0/5.0));
        
        System.out.println("Celcius ke Reamur:");
        System.out.println("Celcius "+ C +" ke Reamur "+((4.0/5.0)*C));
        System.out.println("Reamur "+ R +" ke Celcius "+((5.0/4.0)*R));
        
        System.out.println("Fahrenheit ke Reamur dan sebaliknya:");
        System.out.println("Fahrenheit "+ F +" ke Reamur "+((F-32)*4.0/9.0));
        System.out.println("Reamur "+ R +" ke Fahrenheit "+((9.0/4.0*R)+32));
        
   
    }
}
