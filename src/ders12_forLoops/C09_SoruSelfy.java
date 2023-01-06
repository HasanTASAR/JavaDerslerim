package ders12_forLoops;

import java.util.Scanner;

public class C09_SoruSelfy {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen ilk sayıyı giriniz:");
        int sayi1=scan.nextInt();

        System.out.print("Lütfen ikinci sayı giriniz:");
        int sayi2=scan.nextInt();

        int sayilarToplami=0;

        if (sayi2<sayi1 || sayi1<0 || sayi2<0 ) {
            System.out.println("Yanlış giriş!!");
        }
        else {
        for (int i = sayi1; i <= sayi2 ; i++) {
            sayilarToplami=sayilarToplami+i;
        }
            System.out.println(sayilarToplami);
        }
    }
}
