package ders11_stringManupilations;

public class C03_ReplaceAll {
    public static void main(String[] args) {
        String str="J1ava G9üzel5dir8";
        // rakamları aradan çıkaralım.

        //str.replaceAll() sadece bir harf yada rakam yada char değil tüm ortak karakterleri değiştirir
        System.out.println(str.replaceAll("\\d", "")); //Java güzeldir
        System.out.println(str.replaceAll("\\D", "")); // 12958


        String s1="İlk ürün fiyatı: 12.50 tl";
        String s2="İkinciürün fiyatı: 1500 tl";

        //iki ürünün toplam fiyatı
        s1=s1.replaceAll("\\D", ""); //1250
        s2=s2.replaceAll("\\D","");//1500

        System.out.println(s1+s2);// 12501500?
        int s11=Integer.parseInt(s1);
        int s22=Integer.parseInt(s2);
        System.out.println(s11+s22);//2750
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));

    }
}
