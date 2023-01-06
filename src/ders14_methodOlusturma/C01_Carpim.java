package ders14_methodOlusturma;

import java.util.Scanner;

public class C01_Carpim {
    //main method içerisinde kul. 2 sayı alın.
    // bu iki sayıyı parametre olarak kabul edip çarpımlarını döndüren method oluşturalım

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 2 sayı girin:");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        System.out.println(carpimMethodu(sayi1, sayi2));
    }
    public static double carpimMethodu(double sayi1, double sayi2){
        System.out.println("Çarpım Metodu'u Çalıştı");
        return sayi1*sayi2;
    }
}
