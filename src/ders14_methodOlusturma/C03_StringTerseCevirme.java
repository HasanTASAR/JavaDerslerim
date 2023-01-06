package ders14_methodOlusturma;

import java.util.Scanner;

public class C03_StringTerseCevirme {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz:");
        String metin = scan.nextLine();

        System.out.println(stringTersCevir(metin));

    }

    public static String stringTersCevir(String metin) {
        String tersStr = "";
        for (int i = metin.length() - 1; i >= 0; i--) {
            tersStr = tersStr+metin.charAt(i);
        }
        return tersStr;
    }
}



