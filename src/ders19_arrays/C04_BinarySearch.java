package ders19_arrays;

import java.util.Arrays;

public class C04_BinarySearch {
    public static void main(String[] args) {
        int [] arr={1,8,3,7,9,4,6,4,2,};
        System.out.println(Arrays.binarySearch(arr,8));
        System.out.println(Arrays.binarySearch(arr,6));

        // binary search metodunun doğru sonuçlar verebilmesi için öncelikler sort metodu kullanılmalıdır.
        // sort kullanmadan binarysearch() ile yapılan saram sonucu hatalı olabilir

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,8));
        System.out.println(Arrays.binarySearch(arr,6));

        // arrayda olmayan bir eleman aratırsak
        // java tahmini sırayı negatif olarak verir

        System.out.println(Arrays.binarySearch(arr,-2));
        System.out.println(Arrays.binarySearch(arr,5));



    }
}
