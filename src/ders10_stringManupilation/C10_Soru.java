package ders10_stringManupilation;

public class C10_Soru {
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

        int ilkIndex=cumle.indexOf(metin);
        int sonIndex=cumle.lastIndexOf(metin);
        if (ilkIndex==(-1)) {
            System.out.println("İçermiyor");
        } else if (ilkIndex==sonIndex) {
            System.out.println("1 kez içeriyor");
        }else {
            System.out.println("birden çok içeriyor");
        }
    }
}
