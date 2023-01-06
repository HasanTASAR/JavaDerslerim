package ders07_NestedIfElseStatement;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {
     //Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        // yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla alirsa %15,
        // yoksa %10 indirim yapin


        double urunAdedi= 30;
        double listeFiyati=12.5;
        boolean kKVarMi=true;
        double toplamFiyat=0;

        if (kKVarMi && urunAdedi>=10) { toplamFiyat=urunAdedi*listeFiyati*(0.8);
            System.out.println("%20 İndirimli Toplam Fiyat:"+toplamFiyat);}
        else if (kKVarMi && urunAdedi<10 && urunAdedi>0 ) { toplamFiyat=urunAdedi*listeFiyati*(0.85);
            System.out.println("%15 İndirimli Toplam Fiyatınız:"+toplamFiyat);}

        else if (!kKVarMi && urunAdedi>=10) { toplamFiyat=urunAdedi*listeFiyati*0.85;
            System.out.println("%15 İndirimli toplam Fiyatınız:"+toplamFiyat );}

        else if (!kKVarMi && urunAdedi<10 && urunAdedi>0 ) {
            System.out.println("%10 İndirimli Toplam Fiyatınız:"+toplamFiyat);}
        else {
            System.out.println("Hatalı Giriş!");}
    }
}
