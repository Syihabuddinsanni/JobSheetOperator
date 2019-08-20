package praktikum1;

import java.util.Scanner;


public class KonversiSuhu {
    public static void main(String[] args) {
        
        
        Double Suhu;
        int Celcius, Farenheit = 0;
        
        
        
        
        Scanner baca = new Scanner(System.in) ;
        
        System.err.println("=========TOOLS KONVERSI SUHU CELCIUS KE FARENHEIT=========");
        System.out.print("Masukan Angka Celcius:");
        Celcius = baca.nextInt();
        
        Suhu = Double.valueOf((Celcius * 9/5)+32);
        
        System.out.println("Suhu = " + Suhu + "Farenheit");
        

        
        
        
        
        
        
        
        
    }
    
}
