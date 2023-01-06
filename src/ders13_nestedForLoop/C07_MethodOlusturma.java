package ders13_nestedForLoop;

public class C07_MethodOlusturma {
    public static void main(String[] args) {
        String str = "Java Muhteşemdir";
        //büyük harf yap

        String buyukstr = str.toUpperCase();
        System.out.println(str);
        System.out.println(buyukstr);
        //büyük hali"S" içerirmi ?
        System.out.println(buyukstr.contains("S"));
    }
}

