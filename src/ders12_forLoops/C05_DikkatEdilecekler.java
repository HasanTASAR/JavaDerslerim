package ders12_forLoops;

public class C05_DikkatEdilecekler {
    public static void main(String[] args) {

        /*for (int i = 0; i >-10 ; i++) {
            System.out.println(i);   }
         */

        // ilk değer için bitiş şartı true olmazsa for bodysi devreye girmez
        for (int i = 0; i >10 ; i++) {
            System.out.println(i);

        }
        //bir loopu sonunu beklemeden bitirmek istersek

        // asal sayı olduğunu bulmak için

        int sayi=103;
        int bayrak=0;

        for (int i = 2; i <= sayi-1; i++) {
            if (sayi%i==0) {
                bayrak++;
            }
        }
        if (bayrak==0) {
            System.out.println("Asal Sayı");
        }
        else System.out.println("Asal Sayı Değil");

    }
}
