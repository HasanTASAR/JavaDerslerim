package ders07_NestedIfElseStatement;

import java.util.Scanner;

public class C04_NestedIfElseStatement {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya “Emekli olmak icin ..
        // Yil daha calisman gerekir” yazdirin

        //ana değişken yaş

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen Yaşınızı Giriniz:");
        int yas=scan.nextInt();

        System.out.println("Lütfen Cinsiyetinizi Giriniz:E/K");
        char cinsiyet=scan.next().charAt(0);

        if (yas<16) {System.out.println("Hatalı Yaş Girişi");}

        else if (yas<60) {System.out.println("Emekli olamazsın,");
            if (cinsiyet=='K'|| cinsiyet=='k'){
                System.out.println(+(60-yas)+" yıl daha çalışmalısı.");}
            else if (cinsiyet=='E'  || cinsiyet=='e' ) {
                System.out.println(+(65-yas)+" yıl daha çalışmalısınız.");}}

        else {System.out.println("Hatalı cinsiyet girişi!!");}
    }
}
