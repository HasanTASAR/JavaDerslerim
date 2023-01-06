package ders15_overLoading;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {
        /*
        kullanıcıdan toplanmak üzere sayı alın, toplamı 500'3 eşit olur veya geçerse
        girilen sayı adedi
        girilen sayı toplamı
        "bu kadar yeter" yazdırın..

         */
        Scanner scan=new Scanner(System.in);
        double girilenSayi=0;
        double toplam=0;
        int sayac=0;

        while (toplam<500){
            System.out.println("Toplamak için sayı giriniz.");
            girilenSayi=scan.nextDouble();
            toplam+=girilenSayi; // aynıdır toplam=toplam+girilenSayi
            sayac++;
        }
    }
}
