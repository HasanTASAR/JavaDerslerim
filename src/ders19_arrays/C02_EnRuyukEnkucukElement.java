package ders19_arrays;

import java.util.Arrays;

public class C02_EnRuyukEnkucukElement {
    public static void main(String[] args) {
        // Verilen bir int array'de en kucuk ve en buyuk sayilari
// yazdiran bir method olusturun

        int[] arr={3,8,1,5,2,9};
        enBuyukEnKucukElementYazdir(arr);
    }

    public static void enBuyukEnKucukElementYazdir(int [] arr) {
        Arrays.sort(arr);
        System.out.println("En Büyük element;"+arr[arr.length-1]);
        System.out.println("En Küçük element;"+arr[0]);
    }
}
