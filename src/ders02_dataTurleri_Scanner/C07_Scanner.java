package ders02_dataTurleri_Scanner;

import java.util.Scanner;

public class C07_Scanner {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen İsminizi Giriniz:");
        String isim= scan.nextLine();

        System.out.println("Lütfen Soyisminizi Girin:");
        String soyisim= scan.nextLine();

        System.out.println("Lütfen Yaşınızı Giriniz:");
        int yas= scan.nextInt();
        System.out.println("İsminiz:"+isim+"\nSoyisminiz:"+soyisim+
                "\nYaşınız:"+yas+"\nKaydınız Tamamlanmıştır.");


    }
}
