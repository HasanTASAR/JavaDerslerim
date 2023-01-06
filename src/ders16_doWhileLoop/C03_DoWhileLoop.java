package ders16_doWhileLoop;

import java.util.Scanner;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        // Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol edin ve
        // sifredeki hatalari yazdirin.
        // Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve
        // gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
        //Sifre kucuk harf icermelidir
        //Sifre buyuk harf icermelidir
        //Sifre ozel karakter icermelidir
        //Sifre en az 8 karakter olmalidir

        Scanner scan = new Scanner(System.in);
        String sifre;
        int bayrak;


        do {
            System.out.println("Lütfen Bir Şifre Giriniz");
            sifre = scan.nextLine();

            // tüm hayaları söylemesini istiyorsak bağımsız if ve bayrak gerekir
            bayrak = 0;


            //sifre küçük harf içermelidir
            int sonuc = kucukHarfKontoluYap(sifre);
            //küçük harf kontrolü yapan bir method oluşturalım. varsa 1 yoksa 0 döndürsün
            bayrak = bayrak + sonuc;

            //sifre büyük harf içermelidir
            sonuc = buyukHarfKontroluYap(sifre);
            //büyük harf kontrolü yapan bir method oluşturalım. varsa 1 yoksa 0 döndürsün
            bayrak = bayrak + sonuc;

            //sifre özel karakter içermelidir
            sonuc = ozelKarakterKontroluYap(sifre);
            //özel karakter kontrolü yapan bir method oluşturalım. varsa 1 yoksa 0 döndürsün
            bayrak = bayrak + sonuc;

            //şifre en az 8 karakter olmalıdır
            if (sifre.length() < 8) {
                System.out.println("Şifre En Az 8 Karakter Olmalı");
            } else {
                bayrak++;
            }
            // 4 şart dolayısıyla bayrak 4 olmalıdır
        } while (bayrak != 4);
        System.out.println("Şifreniz Başarıyla Kaydedildi");

    }

    //özel karakter kotrol metodu yapalım-sifre özel karakter içermelidir
    public static int ozelKarakterKontroluYap(String sifre) {
        int bayrak = 0;
        String ozelKarakterler = "§±@!$%^&*()_-+=?/>.<,`~#";
        //özel karakter kontrolü için for loop oluşturalım.

        for (int i = 0; i < sifre.length(); i++) {
            if (ozelKarakterler.contains(sifre.substring(i, i + 1))) {
                bayrak++;
                break;

            }
        }
        // bayrak ==0 ise özel karakter yoktur, yani bir hata vardır. bunu yazdıralım
        if (bayrak == 0) {
            System.out.println("sifre özel karakter içermelidir");
            return 0;
        } else return 1;
    }
    public static int buyukHarfKontroluYap(String sifre) {
        int bayrak = 0;

        for (int i = 0; i < sifre.length(); i++) {
            if (sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z') {
                bayrak++;
                break;

            }
        }
        //bayrak=0 ise büyük harf yoktur, hata için uyaralım
        if (bayrak==0){
            System.out.println("Sifre Büyük Harf İçermelidir");
            return 0;
            }else return 1;
        }
    public static int kucukHarfKontoluYap(String sifre){
        int bayrak=0;

        for (int i = 0; i < sifre.length(); i++) {
            if (sifre.charAt(i)>='a' && sifre.charAt(i) <='z') {
                bayrak++;
                break;
            }
        }
    // bayrak==0 ise küçük harf yoktur bu hatayı yazdıralım
        if (bayrak==0) {
        System.out.println("Sifre Küçük harf içermeli");
          return 0;
        } else return 1;
    }
}

