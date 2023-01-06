package ders15_overLoading;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
       //Kullanicidan Kullanicidan sifre isteyin
        // asagidaki sartlari saglamayan sifrelerde hatalari yazdirip,
        // kullanicinin yeni sifre girmesi isteyin
        //Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin
        // gecerli sifre yazilinca “sifreniz basari ile kaydedildi” yazdirin
        //sartlar :
        //sifrenin ilk karakteri kucuk harf olmali
        //sifrenin son karakteri sayi olmali

        Scanner scan=new Scanner(System.in);
        boolean sifreGecerlMi=false;
        String sifre="";
        int bayrak=0;

        while (sifreGecerlMi !=true) {

            System.out.println("Lütfen Sifrenizi girin");
            sifre=scan.nextLine();
            bayrak=0;

            if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<'z')){
                System.out.println("ilk harf küçük olmalı");
                bayrak++;
            }
            if (!(sifre.charAt(sifre.length()-1)>='0') && sifre.charAt(sifre.length()-1)<='9') {
                System.out.println("son karakter rakam olmalı");
                bayrak++;
            }
            if (bayrak==0) {
                sifreGecerlMi=true;
                System.out.println("Sifreniz başarıyla kaydedildi");
            }
        }
    }
}
