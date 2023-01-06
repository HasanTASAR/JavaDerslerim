package ders09_StringManipulations;

public class C03_EqualsIgnoreCase {
    public static void main(String[] args) {

        String str1="Ali";
        String str2= "ali";
        String str3= "ALI";

        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equals(str3)); // false
        System.out.println(str1.equalsIgnoreCase(str2)); //true
        System.out.println(str1.equalsIgnoreCase(str3)); //true
        System.out.println(str1.equalsIgnoreCase("ali"));//true
        System.out.println(str1.equalsIgnoreCase("ali "));//false

        /*
        equalsIgnoreCase büyük küçük harfi eşih görürü diğer farklılıkları kabul etmez.
         */

    }

}
