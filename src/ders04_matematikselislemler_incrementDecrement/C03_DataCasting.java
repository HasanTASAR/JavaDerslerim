package ders04_matematikselislemler_incrementDecrement;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen İki Tamsayı Giriniz;");

        int sayi1= scan.nextInt();
        int sayi2=scan.nextInt();

        System.out.println(sayi1/sayi2);

        double ondalikliSonuc=(double) (sayi1/sayi2);

        System.out.println(ondalikliSonuc);

        double dogruSonuc=(double) sayi1/sayi2;
        System.out.println(dogruSonuc);









    }


}
