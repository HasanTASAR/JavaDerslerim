package ders07_NestedIfElseStatement;

import java.util.Scanner;

public class C06_NestedIfElseStatements {
    public static void main(String[] args) {

        //Kullanicidan bir sayi alin
        // sayi tek ise negatif veya pozitif tek sayi oldugunu yazdirin,
        // sayi cift sayi ise 10’un tam kati olup olmadigini yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Bir Tam Sayı Giriniz:");
        int sayi = scan.nextInt();

        if (sayi == 0) {
            System.out.println("Geçersiz Giriş");
        }
        else if (sayi % 2 == 1 || sayi % 2==-1) {
            if (sayi > 0) {
                System.out.println("Pozitif tek sayı.");
            }
            else if (sayi < 0) {
                System.out.println("Negatif tek sayı.");
            }
        }
        else if (sayi % 2 == 0) {
            if (sayi % 10 == 0) {
                System.out.println("10'a tam bölünür.");
            } else {
                System.out.println("10'a tam bölünemez");
            }

        }
    }
}