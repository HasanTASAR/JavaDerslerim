package ders14_methodOlusturma;

import java.util.Scanner;

public class C02_StringConcate {

// verilen iki String'i parametre olarak kabul edip
// bu iki String'i aralarinda bir bosluk olan tek bir String olarak
// main method'a donduren bir method olusturun

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 2 sayı girin:");

        String str1 = "Java";
        String str2 = "Candir";

        System.out.println(birlestirmeMethodu(str1, str2));
        System.out.println(birlestirmeMethodu("Anladınız", "mı?"));

    }

    public static String birlestirmeMethodu(String str1,String str2){

        return  str1+" "+str2;

    }
}
