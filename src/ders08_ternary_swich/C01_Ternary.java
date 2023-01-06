package ders08_ternary_swich;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        // kullanıcıdan sayı al
        //sayı pozitif ise katını yazdırın
        //sayı pozitif değilse 10 ekle yazır
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz:");
        double sayi=scan.nextDouble();
        if (sayi>10) {
            System.out.println(sayi*2);
        }
        else {
            System.out.println(sayi+10);
        }

        System.out.println(sayi>0 ? sayi*2 : sayi+10);

    }
}
