package ders10_stringManupilation;

public class C04_EndsWith {
    public static void main(String[] args) {
        String str="Java her yerde güzeldir";
        System.out.println(str.endsWith("güzeldir"));// true
        System.out.println(str.endsWith("Java her yerde güzeldir"));//true
        System.out.println(str.endsWith("java")); // false


    }
}
