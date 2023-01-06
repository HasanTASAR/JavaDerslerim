package ders14_methodOlusturma;

public class C01_S_carpim {
    public static void main(String[] args) {
        //main method içerisinde kul. 2 sayı alın.
        // bu iki sayıyı parametre olarak kabul edip çarpımlarını döndüren method oluşturalım

        /*Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen İlk Sayıyı Giriniz");
        int sayi1= scan.nextInt();
        System.out.println("Lütfen İkinci Sayıyı Giriniz");
        int sayi2=scan.nextInt();
        */

        System.out.println(carpim(7, 9));
    }
    public static int carpim(int sayi1, int sayi2)
    {
        int sonuc;
        sonuc=sayi1*sayi2;
        return sonuc;
    }

}
