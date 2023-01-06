package ders12_forLoops;

import java.util.Scanner;

public class C11_SoruSelfy {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin.

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen 20'den küçük bir sayı giriniz:");
        int sayi=scan.nextInt();
        int faktoriyel=1;

        if (sayi>19) {
            System.out.printf("Hatalı Giriş!");
        }
        else {
            for (int i = 1; i <= sayi; i++) {
                faktoriyel=faktoriyel*i;
            }
            System.out.println(sayi+"nın faktöriyeli:"+faktoriyel);
        }
    }
}
