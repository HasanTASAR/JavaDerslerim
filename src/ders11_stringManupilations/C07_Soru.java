package ders11_stringManupilations;

import java.util.Scanner;

public class C07_Soru {
    public static void main(String[] args) {
        //5 : Kullanicidan isim ve soyismini ayri ayri alin.
        // - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        // - eşit veya soyisim daha uzun ise
        //   ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen Adınızı Giriniz:");
        String ad=scan.nextLine();

        System.out.println("Lütfen Soyadınızı Giriniz:");
        String soyAd=scan.nextLine();

        String yeniAd=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
        String yenisoyAd=soyAd.substring(0,1).toUpperCase()+soyAd.substring(1).toLowerCase();
        String buyuksoyAd=soyAd.toUpperCase();


        if (ad.length()>soyAd.length()){
            System.out.println(yeniAd+" "+yenisoyAd);
        }
        else {
            System.out.println(yeniAd+" "+buyuksoyAd);
        }
    }
}
