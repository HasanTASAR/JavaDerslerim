package ders04_matematikselislemler_incrementDecrement;

import java.util.Scanner;

public class C04_RakamlarToplami {
    public static void main(String[] args) {

        //kullanıcının girdiği 4 basamaklı sayının rakamları toplamını bulalım

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen 4 Basamaklı Bir Sayı Giriniz;");

        int input=scan.nextInt();
        int birlerBasamagi;
        int rakamlartoplami=0;

        birlerBasamagi=input%10;
        rakamlartoplami=rakamlartoplami+birlerBasamagi;
        input = input/10;

        birlerBasamagi=input%10;
        rakamlartoplami=rakamlartoplami+birlerBasamagi;
        input = input/10;


        birlerBasamagi=input%10;
        rakamlartoplami=rakamlartoplami+birlerBasamagi;
        input = input/10;

        birlerBasamagi=input%10;
        rakamlartoplami=rakamlartoplami+birlerBasamagi;
        input = input/10;

        birlerBasamagi=input%10;
        rakamlartoplami=rakamlartoplami+birlerBasamagi;
        input = input/10;

        System.out.println("Rakamlar Toplamı:"+rakamlartoplami);
    }
}
