package ders11_stringManupilations;

public class C06_Soru {
    public static void main(String[] args) {
        // Soru 1 : Kullanicidan bir cumle alin
      // - cumlede ev geciyorsa, "home home sweet home" yazdirin
       // - cumlede is geciyorsa, "calismak guzeldir"
       // - ikisini de iceriyorsa "Hem ev lazim hem is"
          // - hicbirini icermiyorsa "cok calisman lazim" yazdirin

        String cumle="eve geldim, işler birikmiş";
       String cumleCopy="eve geldim, işler birikmiş";

       cumleCopy=cumleCopy.toLowerCase();
        if (cumleCopy.contains("ev") && cumleCopy.contains("iş")) {
            System.out.println("hem ev lazim hem iş");
        }
        else if (cumleCopy.contains("iş")) {System.out.println("calismak guzeldir");
        }
        else if (cumleCopy.contains("ev")) {
            System.out.println("home home sweet home");
        }
        else {
            System.out.println("cok calisman lazim");
        }


    }
}
