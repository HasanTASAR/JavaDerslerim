package ders23_constructor;

public class DAraba {
    // bir proje olusturulurken tum classlarda main method olmasina gerek yoktur
    // cogu class obje olusturularak kullanilmak uzere hazirlanmis depolardir
    // Biz de bu class'i araba objeleri icin bir depo olarak dizayn edelim
    // Her class olusturuldugunda java o class'dan obje olusturulabilmesi icin
    // default bir constructor olusturur
    // Bu default constructor gorunmez
    // default constructor parametresizdir ve bize standart bir obje olusturur
    String marka="Marka belirtilmedi";
    String model="Model belirtilmedi";

    @Override
    public String toString() {
        return "DAraba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yakit='" + yakit + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }

    String yakit;

    int yil;
    int fiyat;

    public int maxHiz(String yakit){
        int maxHiz=120;
        if(yakit.equalsIgnoreCase("dizel")){
            maxHiz=200;
        } else if (yakit.equalsIgnoreCase("benzin")) {
            maxHiz=230;
        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            maxHiz=180;
        }
        return maxHiz;
    }
}
