package ders12_forLoops;

import java.util.Scanner;

public class C13_SoruSelfy {
    public static void main(String[] args) {

        //  // Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.


        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz:");
        int sayi=scan.nextInt();
        String strSayi=""+sayi;
        int birlerBasamagi=0;
        int rakamToplam=0;

        for (int i = 1; i <= strSayi.length() ; i++) {
            birlerBasamagi=sayi%10;
            rakamToplam=rakamToplam+birlerBasamagi;
            sayi=sayi/10;
        }
        System.out.println(rakamToplam);
    }
}
