package ders15_overLoading;

public class C07_WhileLoop {
    public static void main(String[] args) {
        //oru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        // While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method olusturun.

        int sayi=5;
        int us=3;
        usHespla(sayi,us);

    }
    public static void usHespla(int sayi, int us){
        int sonuc=1;

        while(us>0){
            sonuc *= sayi;
            us--;
        }
        System.out.println(sonuc);
    }
}
