package ders15_overLoading;

public class C03_WhileLoop {
    public static void main(String[] args) {
        // 2 basamaklı sayıları aralarında 1 boşlukla yan yana yazdır

        // for loop ile
        for (int i = 10; i < 100; i++) {
            System.out.print(i+" ");
        }
        // While loop ile
        int a=10;
        while (a<100){
            System.out.print(a+" ");
            a++;
        }
    }
}
