package ders03_datacastingWrapperClass;

public class C02_ExplicitNarrowing {

    public static void main(String[] args) {

        // büyüğü küçüğe atamak isterseniz Java sorumluluğu size bırakır
        // bu sorumluluğu almak için cast etmek istediğiniz değerin önüne () içinde cast etmek istediğimiz dat türü yazılır


        double dbl=23.5;
        int sayi=(int)dbl;
        System.out.println(sayi);

    }

}
