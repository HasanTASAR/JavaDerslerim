package ders04_matematikselislemler_incrementDecrement;

public class C01_DataCasting {
    public static void main(String[] args) {
        int sayi1=20;
        int sayi2=6;
        System.out.println(sayi1/sayi2); // 3 olarak verir ondalık kısmı almaz, çünkü int

        double sayi3=6;
        System.out.println(sayi1/sayi3); // 3,333333333335 int/double java geniş olana atar
    }
}
