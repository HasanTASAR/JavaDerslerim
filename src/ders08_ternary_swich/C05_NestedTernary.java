package ders08_ternary_swich;

public class C05_NestedTernary {
    public static void main(String[] args) {
        //Kullanicidan bir tamsayi alin.
        //Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
        // pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin

        int sayi=-20;
        if (sayi>0) {
            //cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
            System.out.println(sayi%2==0 ? "Çift Sayı" : "Çift Sayı Değil");
        }
        else{
            // 3 basamaklı sayı veya 3 basamaklı değilden uygun olan yazılsın
            System.out.println(sayi<-99 && sayi>-1000 ? "üç basamaklı" : "3 basamaklı değil");
        }

        System.out.println( sayi>0
                ?
                sayi%2==0 ? "Çift Sayı" : "Cift Sayı Değil"
                :
                sayi<-99 && sayi<-100 ? "ÜçBasamaklı" : "Üç Basamaklı Değil");

    }
}
