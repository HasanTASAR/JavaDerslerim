package ders11_stringManupilations;

import java.util.Scanner;

public class C09_Soru {
    public static void main(String[] args) {


        //Kullanicidan alinan
        // metindeki istenmeyen rakam ve
        // ozel karakterleri silip,
        //sadece ilk harfi buyuk
        // diger harfler kucuk harf yapan bir program yazin.


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Metin Giriniz:");
        String metin=scan.nextLine();

        /*
            \\s : space \\S : space olmayan hersey
             \\s+ : yanyana birden fazla space
            \\d : digits \\D : digit olmayan hersey
              \\w : harf veya rakam \\W : harf veya rakam olmayan herse
         */

        metin=metin.replace(" ","bosluk").replaceAll("\\W","").
                replaceAll("\\d","").replace("bosluk"," ");
        metin=metin.substring(0,1).toUpperCase()+metin.substring(1).toLowerCase();
        System.out.println(metin);


    }
}
