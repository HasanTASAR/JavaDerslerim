package ders18_arrays;

import java.util.Scanner;

public class C06_KullaniciyaArrayOlusturma {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve
        // bize donduren bir method olusturun.

       arrayOlstur();
    }
    public static int [] arrayOlstur() {
        Scanner scan=new Scanner(System.in);
        System.out.println("array boyutunu girin");
        int lenght=scan.nextInt();
        int [] kullaniciArrayi=new int[lenght];
        for (int i = 0; i < lenght; i++) {

            System.out.println("array'e eklenecek bir sayi giriniz");
            kullaniciArrayi[i]= scan.nextInt();
        }
      return kullaniciArrayi;
    }
}
