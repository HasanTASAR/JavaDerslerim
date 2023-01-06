package ders02_dataTurleri_Scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen kenarları girin"+
                "\niki kenar arasında entere basın");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        System.out.println("Dikdörtgenin alanı:"+(kenar1*kenar2));

    }
}
