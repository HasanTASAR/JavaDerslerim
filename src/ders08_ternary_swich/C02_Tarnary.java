package ders08_ternary_swich;

public class C02_Tarnary {
    public static void main(String[] args) {
        String str1="Ali";
        String str2="ali";

        //verilenler aynı ise aynı
        //farklıysa farklı yazdır

        if (str1.equals(str2)) {
            System.out.println("Metinler aynı");
        }
        else {
            System.out.println("Metinler Farklı");
        }

        System.out.println(str1.equals(str2) ?"Metinler Aynı" : "Metinler Farklı");

    }
}
