package ders08_ternary_swich;

import java.util.Scanner;

public class C09_Tenary {
    public static void main(String[] args) {
        //Kullanicidan bir sayi isteyin, sayiyi kontrol edip
        // 5 ile bolunebiliyorsa “Sayi 5’in tam kati” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir sayı Giriniz:");
        int sayi=scan.nextInt();
        System.out.println(sayi%5==0 ? "Sayı 5'in Tam Katıdır" : "Sayı 5'in Tam Katı Değildir!");
    }
}
