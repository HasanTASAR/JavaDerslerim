package ders15_overLoading;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {
        //
        Scanner scan=new Scanner(System.in);
        int girilenSayi=5; // verilen değer bu sosru için 0 olmamalı. çünkü 0 lopu bitirmek için kullanılacak.

        int sayac=0;
        int toplam=0;

        while (girilenSayi !=0) {
            System.out.println("Lütfen toplamak için tamsayı girin" +
                    "\nBitirmek için 0'a basın");

            girilenSayi= scan.nextInt();
            if (girilenSayi !=0 ) {
                sayac++;
                toplam=toplam+girilenSayi;
            }
        }
    }
}
