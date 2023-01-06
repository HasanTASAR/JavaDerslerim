package ders18_arrays;

public class C07_ArrayEnUzunKisaKelime {
    public static void main(String[] args) {
        //Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

        String [] arr={"hasan","adem","sentürk","ömer","faruk"};
        enUzunEnKisaKelimeYazdir(arr);
    }

    public static void enUzunEnKisaKelimeYazdir(String[]arr) {
        String enUzun=arr[0];
        String enKisa=arr[0];

        for (int i = 1; i < arr.length ; i++) {
            if (arr[i].length()>=enUzun.length()) {
                enUzun=arr[i];
            }
            if (arr[i].length()<=enKisa.length()) {
                enKisa = arr[i];
            }
        }
        System.out.println("en uzun kelime "+enUzun);
        System.out.println("en kısa kelime "+enKisa);

    }
}
