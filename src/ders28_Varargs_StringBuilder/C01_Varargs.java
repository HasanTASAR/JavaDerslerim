package ders28_Varargs_StringBuilder;


public class C01_Varargs {

    public static void main(String[] args) {

    topla(5,6);
    topla(5,6,7);
    topla(5,6,7,8);
    topla(5,6,7,8,9);



    }
    public static void topla( int sayi1, int sayi2){
        System.out.println("2 sayının toplamı: "+(sayi1+sayi2));
    }
    public static void topla( int sayi1, int sayi2,int sayi3){
        System.out.println("2 sayının toplamı: "+(sayi1+sayi2));
    }
    public static void topla( int sayi1, int sayi2,int sayi3,int sayi4){
        System.out.println("2 sayının toplamı: "+(sayi1+sayi2));
    }
    public static void topla( int sayi1, int sayi2,int sayi3, int sayi4, int sayi5){
        System.out.println("2 sayının toplamı: "+(sayi1+sayi2));

    }


}
