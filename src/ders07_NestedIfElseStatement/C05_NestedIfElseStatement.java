package ders07_NestedIfElseStatement;

public class C05_NestedIfElseStatement {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        // yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla alirsa %15,
        // yoksa %10 indirim yapin

        int urunAdedi = 30;
        boolean kartVarMi = false;
        double listeFiyati = 20;
        double toplamFiyat = 0;

        if (kartVarMi) {
            if (urunAdedi < 0) {
                System.out.println("Hatalı Giriş");}
            else if (urunAdedi < 10) {
                toplamFiyat = urunAdedi * listeFiyati * (0.85);
                System.out.println("%15 İndirimli Toplam Fiyatınız:" + toplamFiyat);}
            else  {toplamFiyat = urunAdedi * listeFiyati * (0.8);
                System.out.println("%20 İndirimli Toplam Fiyatınız:" + toplamFiyat);}}
        else {
            if (urunAdedi < 0) {
                System.out.println("Hatalı Giriş");}
            else if (urunAdedi<10) {toplamFiyat = urunAdedi * listeFiyati * (0.90) ;
                System.out.println("%10 İndirimli Toplam Fiyatınız:" + toplamFiyat);}
            else {toplamFiyat = urunAdedi * listeFiyati * (0.85);
            System.out.println("%15 İndirimli Toplam Fiyatınız:" + toplamFiyat);}

        }
    }

}
