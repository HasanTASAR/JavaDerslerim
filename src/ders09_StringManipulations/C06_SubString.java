package ders09_StringManipulations;

public class C06_SubString {
    public static void main(String[] args) {
        String str="Java ogren, isi kap";

        System.out.println(str.substring(5)); //ogren, işi kap
        System.out.println(str.substring(0)); //Java ogren, isi kap
        System.out.println(str.length()); // 19
        // son karakteri String olarak kaydedin

        String sonHarf=""+str.charAt(str.length()-1);
        System.out.println(sonHarf); //p
        //son karakteri büyük yap
        System.out.println(str.substring(str.length()-1).toUpperCase()); //P

        //son harf büyük yaz
        System.out.println(str.substring(str.length()-3).toUpperCase()); // KAP

    }
}
