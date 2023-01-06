package ders09_StringManipulations;

public class C02_Equals {
    public static void main(String[] args) {

        String str1="Ali";
        String str2="ali";

        String str3=new String("Ali");
        String str4="Ali";

        System.out.print(str1==str2);//false
        System.out.println(str1==str3);// false
        System.out.println(str2==str4);//true
        /*
        == stringleri karşılaştırırken neklediğimiz sonuşlar vermeyebilir
        Stringlerde == sürprizler çıkabilir.
        string de == yerine equals() kullanılır
         */
        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equals(str3));//true
        System.out.println(str1.equals(str4));//true


    }

}
