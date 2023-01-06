package ders33_dataType;

public class Corolla extends BToyota{

    String model="corolla";
    String uretimYeri="Türkiye";
    int yil=2023;

    public static void main(String[] args) {

        Corolla corolla1=new Corolla();
        System.out.println(corolla1.model);//Corolla
        System.out.println(corolla1.marka);//BToyota
        System.out.println(corolla1.motor);//Araba
        System.out.println(corolla1.plaka);//Araba
        System.out.println(corolla1.uretimYeri);//Corolla
        System.out.println(corolla1.yil);//Corolla
        System.out.println(corolla1.yakit);//BToyota


        BToyota corolla2=new Corolla();


        System.out.println(corolla2.model);//BToyota
        System.out.println(corolla2.marka);//BToyota
        System.out.println(corolla2.motor);//Araba
        System.out.println(corolla2.plaka);//Araba
        //System.out.println(corolla2.uretimYeri);//Corolla
        System.out.println(corolla2.yil);//BToyota
        System.out.println(corolla2.yakit);//BToyota



        Araba corolla3= new Corolla();

        //System.out.println(corolla3.model);//BToyota
        //System.out.println(corolla3.marka);//BToyota
        System.out.println(corolla3.motor);//Araba
        System.out.println(corolla3.plaka);//Araba
       // System.out.println(corolla3.uretimYeri);//Corolla
        //System.out.println(corolla3.yil);//BToyota
        System.out.println(corolla3.yakit);//BToyota


        BToyota toyota1=new BToyota();



    }
}
