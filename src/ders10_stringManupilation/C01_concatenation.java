package ders10_stringManupilation;

public class C01_concatenation {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2= "Güzeldir";
        boolean bl= true;
        int sayi=20;
        double dbl=3.54;
        System.out.println(str1+bl+sayi); //Javatrue20

        // System.out.println(bl+sayi);
        // string dışındaki data türlerinde toplama yapmamıza izin vermez

        System.out.println(sayi+dbl); // 23.54 double yaptı çünkü dbl büyük int

        //System.out.println(str1.concat(bl));

    }
}
