package ders03_datacastingWrapperClass;

import java.util.Scanner;

public class C04_CharDataCasting {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        //kullanıcıdan bir char bir karakter alın
        //o karakterden sonra 3 karakteri yazalım
        // örnek input :a , output bcd

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen Bir Karakter girin");

        char girilenKrk=scan.next().charAt(0);
        System.out.println(""+(char)(girilenKrk+1)+(char)(girilenKrk+2)+(char)(girilenKrk+3));

    }
}
