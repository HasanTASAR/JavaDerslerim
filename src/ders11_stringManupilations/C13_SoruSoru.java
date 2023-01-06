package ders11_stringManupilations;

import java.util.Scanner;

public class C13_SoruSoru {
    public static void main(String[] args) {

        //Kullanicidan alinan bir String alin,
        // String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
        // String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin

        Scanner scan=new Scanner(System.in);


        System.out.println("Lütfen Metin Giriniz;");
        String metin=scan.nextLine();
        String ilkYari;
        String ikinciYari;

        if (!(metin.length()%2==0)){
            ilkYari=metin.substring(0,(metin.length())/2);
            ikinciYari=metin.substring((metin.length()+2)/2);
            System.out.println(ilkYari+":)"+ikinciYari);

       }else {
           ilkYari=metin.substring(0,(metin.length())/2);
            ikinciYari=metin.substring((metin.length())/2);
            System.out.println(ilkYari+":)"+ikinciYari);
        }
    }
}
