package ders07_NestedIfElseStatement;

import java.util.Scanner;

public class C07_NestedIfElseStatements {

    public static void main(String[] args) {

        //- Kullanicidan gunu ismini girmesini isteyin,
        // girilen gun hafta ici bir gun ise“Simdi calisma zamani tatile .. gun var”
        // seklinde hafta sonu tatiline kac gun kaldigini yazdirin,
        // girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen için bulunduğunuz günü küçük harflerle yazınız");
        String gun = scan.nextLine();

        if (gun.equalsIgnoreCase("pazartesi")) {
            System.out.println("Şimdi Çalışma Zamanı, Tatile 5 Gün Kaldı.");
            }
        else if (gun.equalsIgnoreCase("salı")) {
                System.out.println("Şimdi Çalışma Zamanı, Tatile 4 Gün Kaldı.");
            }
        else if (gun.equalsIgnoreCase("çarşamba")) {
                System.out.println("Şimdi Çalışma Zamanı, Tatile 3 Gün Kaldı.");
            }
        else if (gun.equalsIgnoreCase("perşembe")) {
                System.out.println("Şimdi Çalışma Zamanı, Tatile 2 Gün Kaldı.");
            }
        else if (gun.equalsIgnoreCase("cuma")) {
                System.out.println("Şimdi Çalışma Zamanı, Tatile 1 Gün Kaldı.");
        }
        else if (gun.equalsIgnoreCase("cumartesi") || gun.equalsIgnoreCase("pazar")) {
            System.out.println("Şimdi Dinlenme Zamanı!!");
        }
        else {
            System.out.println("Yanlış Giriş!!");
        }
    }
}