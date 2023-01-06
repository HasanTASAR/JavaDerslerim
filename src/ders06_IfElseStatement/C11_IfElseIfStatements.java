package ders06_IfElseStatement;

import java.util.Scanner;

public class C11_IfElseIfStatements {
    public static void main(String[] args) {
        //Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        //hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
        //obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
        //zayif yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Kilonuzu Yazınız");
        int kilo= scan.nextInt();

        System.out.println("lütfen Boyunuzu Yazınız");
        int boy= scan.nextInt();

        double endeks=(kilo*10000)/(boy*boy);
        if (endeks>30) {
            System.out.println("OBEZ");
        }
        else if (endeks>24) {
            System.out.println("KİLOLU");}
        else if (endeks>19) {
            System.out.println("NORMAL");}
        else {
            System.out.println("ZAYIF");
        }

    }
}
