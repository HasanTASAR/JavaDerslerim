package ders12_forLoops;

import java.util.Scanner;

public class C16_SoruSlefy {

    public static void main(String[] args) {
        /*
        Kullanicidan bir pozitif tam sayi isteyin,
        sayının tam kare olup olmadığını bulunuz,
        tamkare ise true değilse false yazdırınız.
        Ornek : input : 16, output: 4
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz:");
        int sayi=scan.nextInt();
        int tamKare=1;

        for (int i = sayi; i>0; i--) {
            tamKare = i * i;

            if (sayi == tamKare) {
                System.out.println("sayi tam karedir");
                break;
            }

        } if(!(sayi==tamKare)) {
            System.out.println("Sayi tam kare değil");
        }

    }
}
