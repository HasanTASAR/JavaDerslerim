package ders08_ternary_swich;

public class C03_Ternary {
    public static void main(String[] args) {

        int a=5;

        // ternary operatörü tek başına yazılamaz, tearnary bize sonuç üretir
        //bu sonucu ya yazdırmalı yada bir veriableye atamalıyız

        String sonuc=  a%2==0 ? "Çift Sayı" : "Tek sayı";

        //ternary'nin sonucunu bir variableye ayatacaksa true ve false durumlarında
        // üretilecek sonucun aynı data türüne uygun olması gereki

        String sonuc2= a>10 ? "büyük sayı" :  ""+2*a;  // ""+ ile 2*a yı string yaptık

        System.out.println( a>10 ? "büyük sayı" : 2*a );// sout içinde hata vermez ve yazdırır


    }
}
