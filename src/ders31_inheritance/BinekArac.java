package ders31_inheritance;

public class BinekArac extends Arac{
    protected String marka="Binek araçların markası vardır";
    protected String model="Binek araçların modeli vardır";
    protected int yil=1990;

    protected void hiz(){
        System.out.println("Binek Araç hızları modele göre değişir");
    }
    protected void teker(){
        System.out.println("Binek araçları 4 tekeri vardır");
    }

}
