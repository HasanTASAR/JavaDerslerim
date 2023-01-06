package ders06_IfElseStatement;

import java.util.Scanner;

public class C12_IfElseStatements {
    public static void main(String[] args) {
        // Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
        //sorun,
        //istedigi birim metre veya santimetre ise cevirip yazdirin,
        // yoksa istediginiz birim sisteme kayitli degil” yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen Mesafeyi Kilometre Cinsinden Giriniz:");

        double mesafeKm= scan.nextDouble();

        System.out.println("Mesafeyi Çevirmek istediğiniz Birim Metre ise 'M', Santimetre İse 's'yi tuşlayınız.");
        char cevir=scan.next().charAt(0);

        int mesafeM=(int)mesafeKm*1000;
        int mesafeS= mesafeM*100;

        if (cevir=='m'|| cevir=='M') {System.out.println(mesafeKm+" Km ="+mesafeM+" metre");}
        else if (cevir=='s' || cevir=='S') {System.out.println(mesafeKm+"Km="+mesafeS+" santimtredir");}
        else {
            System.out.println("Geçersiz Giriş!");
        }


    }
}
