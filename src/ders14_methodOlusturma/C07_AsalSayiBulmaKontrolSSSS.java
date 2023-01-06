package ders14_methodOlusturma;

import java.util.Scanner;

public class C07_AsalSayiBulmaKontrolSSSS {
    /*
    Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin.
    Girilen sayinin asal sayi olup olmadigini kontrol edip,
    sonuc olarak “asal sayi” veya “asal sayi degil” sonuclarini donduren bir method olusturun.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz.");
        int sayi= scan.nextInt();
        System.out.println(asalKontrol(sayi));

    }
    public static String asalKontrol(int sayi) {
        String sonuc = "";
        for (int i = 2; i <= (sayi-1); i++) {
            if (sayi % i == 0) {
                sonuc = "Asal değil";
                break;
            }

        }
        if (!sonuc.equals("Asal Değil")) {
            sonuc="Asal";
        }
        return sonuc;

    }

}
