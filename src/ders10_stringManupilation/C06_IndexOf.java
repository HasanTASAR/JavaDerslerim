package ders10_stringManupilation;

public class C06_IndexOf {
    public static void main(String[] args) {
        String str="Ahmet Hoca ile herşey clear";
        System.out.println(str.indexOf("a"));// 9- ilk a'nın indeksi
        System.out.println(str.indexOf("c"));// 8
        System.out.println(str.indexOf("herşey"));//15 baçlangıcı verir
        System.out.println(str.indexOf("e",9)); // 13

        // 13. e den sonraki e'nin indeksi için
        System.out.println(str.indexOf("e",14));

        //cümledeki ikinci c'nin indeksi
        System.out.println(str.indexOf("c")); // 8
        System.out.println(str.indexOf("c",8+1));
        int ilkC=str.indexOf("c");
        System.out.println(str.indexOf("c", ilkC+1));

        System.out.println(str.indexOf("ali"));// indek olarak döndürmesini bekliyoruz bu nedenle-1 verir
    }
}
