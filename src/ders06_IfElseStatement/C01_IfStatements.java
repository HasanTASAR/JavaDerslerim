package ders06_IfElseStatement;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {
        // Kullanıcısn bir harf alın, o harften ay varsa yazdırın, büyük küçük harf ayrımı olmayacak
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen Bir Harf Yazınız:");
        char ilkHarf=scan.next().charAt(0);

        if (ilkHarf=='o' || ilkHarf=='O') {
            System.out.println("Ocak");
        }
        if (ilkHarf=='ş' || ilkHarf=='Ş') {
            System.out.println("Şubat");
        }
        if (ilkHarf=='m' || ilkHarf=='M') {
            System.out.println("Mart ve Mayıs");
        }
        if (ilkHarf=='n' || ilkHarf=='N') {
            System.out.println("Nisan");
        }
        if (ilkHarf=='h' || ilkHarf=='H') {
            System.out.println("Haziran");
        }
        if (ilkHarf=='t' || ilkHarf=='T') {
            System.out.println("Temmuz");
        }
        if (ilkHarf=='a' || ilkHarf=='A') {
            System.out.println("Ağustos veya Aralık");
        }
        if (ilkHarf=='e' || ilkHarf=='E') {
            System.out.println("Eylül veya Ekim");
        }
        if (ilkHarf=='k' || ilkHarf=='K') {
            System.out.println("Kasım");
        }


    }
}
