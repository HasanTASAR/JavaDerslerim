package ders18_arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        int [] arr1={2,4,6,8,10};
        // arrayin 2. indeksi için
        System.out.println(arr1[2]); // 6

        arr1[3]=20;
        System.out.println(arr1[3]); // 20

        System.out.println(arr1.length); // element sayısı 5

        // son elementi yazdıralım
        System.out.println(arr1[arr1.length-1]); //10

        
        // arrayın tüm elemetlerini yazıralım
        for (int i =0 ; i < arr1.length ; i++) {
            System.out.println(arr1[i]+" ");
        }
        // array uzunluğu sonra değiştirilemez
        // eğer arrayde olmayan bir endekse atama yapmak isterseniz java AIOBE
        // bu hata neden CTE değil
        // run time eror olduğunu anlaması için çalışması gerekir
       // arr1[5]=35;


    }
}
