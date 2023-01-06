package ders02_dataTurleri_Scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        // kullanıcıdan ismini alıp büyük harfle yazalım

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen Adinizi Giriniz:");
        String kullaniciAdi= scan.next();
        System.out.println(kullaniciAdi.toUpperCase());
    }
}
