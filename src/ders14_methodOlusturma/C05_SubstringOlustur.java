package ders14_methodOlusturma;

import java.util.Scanner;

public class C05_SubstringOlustur {

    public static void main(String[] args) {


        // Kullanicidan input olarak verilen bir String,
        // baslangic ve bitis indexlerine gore baslangic index’i dahil,
        // bitis index’i haric olacak sekilde aradaki harfleri yazdiran bir method olusturun.
        // kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
        //kullanici str’da olan index’lerden daha buyuk bir index girerse hata mesaji yazdirin.


        Scanner scan=new Scanner(System.in);

        System.out.println("Bir metin girin;");
        String input = scan.nextLine();

        System.out.println("Bir ilk sayıyı girin;");
        int basI = scan.nextInt();

        System.out.println("Bir ikinci sayıyı girin;");
        int sonI = scan.nextInt();

        kendiMetodumuz(input,basI,sonI);

    }

    public static void kendiMetodumuz(String input, int basI, int sonI) {
        if (basI > sonI) {
            System.out.println("Başlangıç İndeksi Son İndeksten Büyük olamaz!");
        } else if (sonI >= input.length() - 1) {
            System.out.println("Bitiş İndeksi String'in sınırları dışındadır!");
        } else {
            for (int i = basI; i < sonI; i++) {
                //System.out.print(input.charAt(i));
            }
           // System.out.println("");
        }
    }

}
