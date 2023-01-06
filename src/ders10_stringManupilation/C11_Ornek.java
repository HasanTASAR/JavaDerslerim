package ders10_stringManupilation;

import java.util.Scanner;

public class C11_Ornek {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen ilk kelimeyi giriniz:");
        String klm1=scan.next();

        System.out.println("Lütfen ikinci kelimeyi giriniz:");
        String klm2=scan.next();

        if (klm1.equals(klm2)) {
            System.out.println("Kelimeler aynı");
        }
        else {
            System.out.println("Kelimeler farklı");
        }
    }
}

