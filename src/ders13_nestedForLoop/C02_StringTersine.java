package ders13_nestedForLoop;

public class C02_StringTersine {
    public static void main(String[] args) {
        //Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

        String input="Java Her Gçen gün Güzelleşiyor";
        String tersInput="";

        for (int i = input.length()-1; i >= 0 ; i--) {
            tersInput+=input.substring(i, i+1);
        }
        System.out.println("Ters Hali;"+tersInput);
    }
}
