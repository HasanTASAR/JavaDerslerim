package ders08_ternary_swich;

import java.util.Scanner;

public class C10_Tenary {
    public static void main(String[] args) {
        //Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyukharf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen Bir Harf Giriniz:");

        char krk=scan.next().charAt(0);
        System.out.println(krk>97 && krk<122 ? (char)(krk-32) : krk);
    }
}
