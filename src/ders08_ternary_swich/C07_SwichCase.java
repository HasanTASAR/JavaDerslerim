package ders08_ternary_swich;

import java.util.Scanner;

public class C07_SwichCase {
    public static void main(String[] args) {
        //J: Java
        //D: Development
        //K:Kit
        //Kullanıcıdan bir harf alın
        //Alınan harf ; D, K'dan biri ise kelimeyi yazdır
        // değilse "Geçersiz Giriş"

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir harf Girin:");
        char harf=scan.next().charAt(0);

        switch (harf) {
            case 'J':
            case 'j':
                System.out.println("Java");
            break;
            case 'D':
            case 'd':
                System.out.println("Development");
            break;
            case 'K':
            case 'k':
                System.out.println("Kit");
            break;
            default:
                System.out.println("Hatalı Giriş");

        }
    }
}
