package ders08_ternary_swich;

import java.util.Scanner;

public class C08_SwitchCase {
    public static void main(String[] args) {
        //Kullanıcısan ay numarası alıp mevsim yazdıralı.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir sayı Girin:");
        int ayNo=scan.nextInt();

        switch (ayNo){
            case 12:
            case 1:
            case 2:
            System.out.println("Kış");
            break;
            case 3:
            case 4:
            case 5:
                System.out.println("İlkbahar");
            break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
            break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
            break;
            default:
                System.out.println("Hatalı Giriş");
        }

    }
}
