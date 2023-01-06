package ders19_arrays;

import ders18_arrays.C03_ArraysElemetArtirma;
import ders18_arrays.C04_ArraysToplama;
import ders18_arrays.C05_ArrayElemanArama;
import ders18_arrays.C06_KullaniciyaArrayOlusturma;

import java.util.Arrays;

public class C03_MethodlariKullanma {
    public static void main(String[] args) {

        // verilen int arrayin değelerini 2 artır

        int[] arr= {2,3,4};

        arr= C03_ArraysElemetArtirma.elementleri2Artir(arr);
        System.out.println(Arrays.toString(arr)); // [4, 5, 6]

        // arr array'inin elementlerini toplayip sonucu yazdirin
        System.out.println(C04_ArraysToplama.pozitifElementleriTopla(arr)); // 15

        // arr array'inde 10 element olarak var mi ?
        C05_ArrayElemanArama.elemanAra(arr,10); // Aranan sayi array'de yok

        // kullanicidan deger alarak bir array olusturun
        int[] yeniArr= C06_KullaniciyaArrayOlusturma.arrayOlstur();
        System.out.println(Arrays.toString(yeniArr));

    }
}
