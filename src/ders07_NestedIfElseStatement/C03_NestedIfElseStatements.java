package ders07_NestedIfElseStatement;

import java.util.Scanner;

public class C03_NestedIfElseStatements {

    public static void main(String[] args) {

        //Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya “Emekli olmak icin ..
        // Yil daha calisman gerekir” yazdirin

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen Cinsiyetinizi Giriniz: K/E");
        char cinsiyet =scan.next().charAt(0);

        System.out.println("Lütfen Yaşınızı Giriniz:");
        int yas = scan.nextInt();

        // nested if-else seklinde kullanim icin once ana degiskeni secip
        // ona gore ana yapiyi olusturalim
        // cinsiyet ana degisken olsun

        if (cinsiyet == 'K' || cinsiyet == 'k') {
            if (yas < 16) {
                System.out.println("Geçersiz Giriş!!");
            } else if (yas < 60) {
                System.out.println("Emekli Olmanız İçin:" + (60 - yas) + " Yıl daha Çalışmalısınız.");
            } else if (yas > 60) {
                System.out.println("Emekli Olabilirsiniz");
            }
        } else if (cinsiyet == 'e' || cinsiyet == 'E') {
            if (yas < 16) {
                System.out.println("Geçersiz Giriş!");
            } else if (yas < 65) {
                System.out.println("Emekli Olmanıza" + (65 - yas) + " yıl kaldı.");
            } else if (yas >= 65) {
                System.out.println("Emekli Olabilirsiniz.");}}

        else {
            System.out.println("Hatalı Giriş!");
        }
    }
}

