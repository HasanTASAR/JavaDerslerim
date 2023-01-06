package ders08_ternary_swich;

public class C04_Ternary {
    public static void main(String[] args) {
        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin,
        // degilse “Eskenar degil” yazdirin.

        int kenar1=10;
        int kenar2=12;
        int kenar3=10;
        System.out.println(kenar1>0 && kenar2>0 && kenar3>0 && kenar1==kenar2 && kenar2==kenar3 ?
                "Eşkenar Üçgen" : "Eşkenar Üçgen Değil");

        // kullanıcıdan 2 sayı alın
        //büyük olmayanı yazdırın

        int sayi1=10;
        int sayi2=11;
        System.out.println(sayi1>sayi2 ? sayi2 : sayi1);

    }
}
