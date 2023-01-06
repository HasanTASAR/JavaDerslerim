package ders09_StringManipulations;

public class C01_ToUperCase {
    public static void main(String[] args) {
        String str="Java Mutluluktur";
        System.out.println(str.toUpperCase()); //JAVA MUTLULUKTUR
        System.out.println(str); // Java Mutluluktur

        str=str.toUpperCase();
        System.out.println(str);// JAVA MUTLULUKTUR

        str="ince mehmet";
        str=str.toUpperCase();
        System.out.println(str); // INCE MEHMET
        str=str.toLowerCase();
        System.out.println(str); //ince mehmet

    }
}
