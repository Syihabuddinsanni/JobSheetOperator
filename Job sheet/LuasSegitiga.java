package praktikum1;

import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args){
        
        Double luas;
        int alas, tinggi;
        
        Scanner baca;
        baca = new Scanner(System.in);
        
        System.out.println("== Program hitung luas Segitiga ==");
        System.out.print("input alas: ");
        alas = baca.nextInt();
        System.out.print("Input tinggi: ");
        tinggi = baca.nextInt();
        
        luas = Double.valueOf((alas * tinggi) / 2);
        
        System.out.println("luas = " + luas);
        
        
        
        
        
    }
    
}
