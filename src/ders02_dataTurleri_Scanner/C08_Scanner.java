package ders02_dataTurleri_Scanner;


import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan 2 sayı alıp değerlerini değiştirelim

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen Birinci Sayıyı Girin:");
        int sayi1= scan.nextInt();

        System.out.println("lütfen İkinci Sayıyı Girin:");
        int sayi2= scan.nextInt();


        int bos;
        bos= sayi2;
        sayi2 = sayi1;
        sayi1= bos;
        System.out.println("sayı 1'in değeri:"+sayi1);
        System.out.println("Sayı 2'nin Değeri:"+sayi2);

    }
}
