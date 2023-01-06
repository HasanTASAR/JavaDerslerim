package ders11_stringManupilations;

public class C04_RePlaceAll {
    public static void main(String[] args) {
        // kullanıcının girdiği metinde harf dışında kalan karakterleri temizleyen bir kod, ancak boşluklar kalmalı.

        String str="Ja5+va cok 1*guzel";



        str=str.replaceAll("\\d", "");
        str=str.replace(" ","0");
        str=str.replaceAll("\\W", "");
        str=str.replace("0", " ");
        System.out.println(str);


    }


}
