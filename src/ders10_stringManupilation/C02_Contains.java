package ders10_stringManupilation;

public class C02_Contains {
    public static void main(String[] args) {
        String str="Java ile kodlama çok zevkli";
        str.contains("çok");
        //CharSquens; char dizisi
        System.out.println(str.contains("çok"));//true
        System.out.println(str.contains("odla"));//true
        System.out.println(str.contains("a"));//true
        // System.out.println(str.contains('c')); char kabul etmez // false

        String str2="java";
        System.out.println(str.contains(str2)); // false
        String str3="234 Ali Can";
        System.out.println(str3.contains("2")); // true


    }
}
