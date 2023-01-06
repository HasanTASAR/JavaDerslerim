package ders19_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C09_KullanicidanDegerAlarakArrayOlustur {
    public static void main(String[] args) {
        // kullanıcıdan istediği kadar sayi alıp bir array oluştur
        // kullanıcı eleman girişini birmek için 0'a bassın

        Scanner scan = new Scanner(System.in);
        int[] arr={0};
        int girilensayi=0;

        do {
            System.out.println("array'e eklemek icin bir tamsayi giriniz " +
                    "\nBitirmek icin 0'a basin");
            girilensayi= scan.nextInt();

            if (arr[0]==0 ){
                arr[0]=girilensayi;
            }else if(girilensayi!=0){
                arr=C08_ArrayaEklemeMetodu.arrayeElemanEkle(arr,girilensayi);
            }

        }while(girilensayi!=0);
        System.out.println(Arrays.toString(arr));

    }
}
