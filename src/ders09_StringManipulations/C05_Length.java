package ders09_StringManipulations;

public class C05_Length {
    public static void main(String[] args) {
        String str="Uzunkavakalaraltındayataruyumazoğlu";
        System.out.println(str.length());

        // son karakter nedir
        System.out.println(str.charAt(str.length()-1));
    }

}
