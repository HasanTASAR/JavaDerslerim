package ders10_stringManupilation;

public class C07_Soru  {
    public static void main(String[] args) {


    /*
     Kullanicidan bir cumle ve bir metin alin
  cumlede metnin durumuna gore
  1- cumle metni icermiyor
  2- cumle metni sadece 1 kere iceriyor
  3- cumle metni birden fazla iceriyor
  seceneklerinden uygun olani yazdirin
     */
        String cumle = "Java Çok güzeldir çok";
        String metin = "Java";
        if (!cumle.contains(metin)) {
            System.out.println("cumle metni içermiyor");
        } else {
            int ilkIndex=cumle.indexOf(metin); //5
            int  ikinciIndex=cumle.indexOf(metin, ilkIndex+1); // ya -1 olacak yada bir index verecek
            if (ikinciIndex==(-1)) {
                System.out.println("Cümle Metini 1 kez içeriyor");
            }
            else {
                System.out.println("Cüle metni 1 den fajla kez tekrar ediyor");
            }
        }
    }
}
