package ders10_stringManupilation;

public class C03_StartsWith {
    public static void main(String[] args) {
        String str="mantı açarken Java öğrenilmez.";
        System.out.println(str.startsWith("Mantı"));// false bk harf farkı
        System.out.println(str.startsWith("m")); // true
        System.out.println(str.startsWith("")); // true

        System.out.println(str.startsWith("açarken",6));// true
        System.out.println(str.startsWith("mantı",0)); //true
        System.out.println(str.startsWith("java",10));// false
    }
}
