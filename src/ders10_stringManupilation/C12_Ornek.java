package ders10_stringManupilation;

import java.util.Scanner;

public class C12_Ornek {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki kelime giriniz:");
        String klm1=scan.next();
        String klm2= scan.next();
         if (klm1.equals(klm2)) {
             System.out.println("Kelimler tamamen aynı");
         }
         else if (klm1.equalsIgnoreCase(klm2)) {
             System.out.println("Büyük küçük harf farklılığı olsa da kelimeler aynı");
         }
         else {
             System.out.println("Kelimeler Farklı");

         }
    }
}
