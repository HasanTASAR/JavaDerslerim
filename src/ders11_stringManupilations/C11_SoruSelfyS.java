package ders11_stringManupilations;

import java.util.Scanner;

public class C11_SoruSelfyS {
    public static void main(String[] args) {

        //Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve
        // kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //ilk harf kucuk harf olmali
        //son karakter rakam olmali
        //sifre bosluk icermemeli
        //uzunlugu en az 10 karakter olmali

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Sifrenizi Giriniz;");
        String sifre=scan.nextLine();

        int bayrak=0;

        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z'));
        {
            System.out.println("İlk Harf Küçük Olmalı");
            bayrak++;

        }
        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9'));
        {
            System.out.println("Son Karakter Rakam Olmalı");
            bayrak++;
        }
        if ((sifre.contains(" ")));
        {
            System.out.println("Sifre Boşluk İçermemeli");
            bayrak++;
        }
        if (!(sifre.length()>=10));
        {
            System.out.println("Şifre En Az 10 Karakter içermeli");
            bayrak++;
        }
        if (bayrak==0)
        {
            System.out.println("Şifre başarıyla kaydedildi");
        }
    }
}
