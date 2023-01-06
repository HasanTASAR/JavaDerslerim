package ders19_arrays;

import java.util.Arrays;

public class C07_ArrayeYeniElementEkleme {
    public static void main(String[] args) {

        int[] arr={2,4,6};

        // bu arraya 4. bir element olarak 8 ekleyelim
        /*
        var olan arraya yeni eleman eklenemez, ama yeni değer atanabilir
        yeni bir arr2={2,4,6,8} oluşturup arr1 e arr2 yi atayabilirim.
         */
        // yeni array oluşturalım
        //arr2ye oluşturulacak türü
        // uzunluğu arr1 den bir fazla olacak

        int [] arr2=new int[arr.length+1]; //[0,0,0,0]
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[i];
        }
        System.out.println(Arrays.toString(arr2)); // [2,4,6,0]
        arr2[arr2.length-1]=8;
        System.out.println(Arrays.toString(arr2)); // [2,4,6,8]
        arr=arr2;
        System.out.println("arr£nin son hali"+arr);
    }
}
