package ders11_stringManupilations;

public class C02_RePlace {
    public static void main(String[] args) {
        String str="Java Candır";
        System.out.println(str.replace('a', 'A'));//
        System.out.println(str.replace(' ' , '_'));//

        System.out.println(str.replace("candır", "çok güzeldir"));//

        System.out.println(str.replace("Java", "Hava")
                .replace("candır", "çok güzel")); //Hava çok güzel

        // sadece 1. a'yı A yapın.
        System.out.println(str.replaceAll("a", "A")); //JAva candır
    }
}
