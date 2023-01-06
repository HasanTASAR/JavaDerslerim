package ders08_ternary_swich;

import java.util.Scanner;

public class C12_Tenary {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin ve mutlak degerini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz:");
        int sayi= scan.nextInt();
        System.out.println(sayi>=0 ? "Sayının Mutlak Değeri:"+sayi : "Sayının Mulak Değeri:"+sayi*-1);
    }
}
