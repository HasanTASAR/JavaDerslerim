package ders06_IfElseStatement;

import java.util.Scanner;

public class C10_IfElseIfStatements {
    //Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
    // Erkek 65 yas ve uzeri emekli olabilir.
    // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya “Emekli olmak icin ..
    // Yil daha calisman gerekir” yazdirin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Cinsiyetinizi Erkek ise 'E' Kadın iseniz 'K' olarak Giriniz;");
        char cinsiyet = scan.next().charAt(0);

        System.out.println("Lütfen Yaşınızı Giriniz");
        int yas = scan.nextInt();


        if (cinsiyet == 'e' || cinsiyet == 'E') {
            if (yas >= 65) {
                System.out.println("Emekli olabilirsiniz");
            } else {
                System.out.println("Emekli Olmanıza " + (65 - yas) + " yıl kaldı.");
            }
        } else if (yas >= 60) {
            System.out.println("Emekli Olabilirsiniz!");
        } else {
            System.out.println("Emekli olmanıza " + (60 - yas) + " yıl kaldı");}
    }


}




