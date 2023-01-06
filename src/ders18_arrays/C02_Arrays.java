package ders18_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String [] arr={"Ali","Ulus", "Nesrin" };

        // bu arrayın tüm elemtlerini araalrınde boşluk bırakarak yazdır

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println("");


        // bu arrayi array olarak yazıralım
        System.out.println(arr);
        // array bir obje/nonprimitive data olduğu için java referansı yadırır
        //arrayi array gibi yazırnak için array class kullanırız
        System.out.println(Arrays.toString(arr));
    }
}
