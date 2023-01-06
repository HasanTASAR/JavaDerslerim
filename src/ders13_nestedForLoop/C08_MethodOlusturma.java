package ders13_nestedForLoop;

import java.util.Scanner;

public class C08_MethodOlusturma {
    public static void main(String[] args) {
        /*
        kul. 2 sayı al, toplamını yazdıran metod oluştur.
         */

        isteToplaYazdir();
        isteToplaYazdir();
    }


    public static void isteToplaYazdir() {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen İlk Sayıyı Giriniz:");
       double sayi1=scan.nextDouble();

        System.out.println("Lütfen ikinci Sayıyı Giriniz:");
        double sayi2=scan.nextDouble();

        System.out.println("Sayılar toplamı:"+(sayi1+sayi2));

    }
}
