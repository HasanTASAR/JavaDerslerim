package ders09_StringManipulations;

public class C07_SubString {
    public static void main(String[] args) {

        String str= "Java gün geçtikçe güzelleşiyor";
        System.out.println(str.substring(5,8));
        //5 dahil(inclusive), 8 değil(exclusive). 3 karakter
        System.out.println(str.substring(9,17));
        System.out.println(str.substring(3,7));


        //verilen ismi ilk harfi büyük diğerleri küçük yazdır
        String isim="huseYIN";
        isim=isim.substring(0,1).toUpperCase()+ //ilk harfi alıp büyük yaptık
        isim.substring(1).toLowerCase(); //1. indeks ve sonrası küçük
        System.out.println(isim);// Huseyin

        //sadece 3. indeksi yazdır
        System.out.println(isim.substring(3,4));//e
        System.out.println(isim.substring(2,2)); // boşluk
        System.out.println(isim.substring(5,2)); // hata verir
        isim.subSequence(5,10);




    }

}
