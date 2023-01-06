package ders12_forLoops;

import java.util.Scanner;

public class C12_SoruSelfy {
    public static void main(String[] args) {

        //Soru 6- Kullanicidan 20’den kucuk bir sayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        // Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 20'den küçük bir sayı giriniz:");
        int sayi = scan.nextInt();
        int faktoriyel = 1;


        if (sayi > 19) {
            System.out.println("Hatalı Giriş!");
        } else {

            String text = sayi + "! = ";
            for (int i = sayi; i >= 1; i--) {
                faktoriyel = faktoriyel * i;

                text += i + "*";
            }
            text = text.substring(0, text.length() - 1);
            text += "=" + faktoriyel;
            System.out.println(text);
        }
    }
}
