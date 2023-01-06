package ders11_stringManupilations;

public class C10_Soru {
    public static void main(String[] args) {
        // Kullanicinin belirli bir formatta verdigi
        // String fiyatlari toplayip yazdirin.
       //input1 : “15.30 €” , input2 : “11.40 €”output : 36.70 €

        //Regex (Regular Expressions)
         /* \\s : space \\S : space olmayan hersey
         \\s+ : yanyana birden fazla space
         \\d : digits \\D : digit olmayan hersey
           \\w : harf veya rakam \\W : harf veya rakam olmayan herse

        */

        String str1="input : “15.30 €” ";
        String str2= "input : “11.40 €”";
        String str3="output : 36.70 €";

        System.out.println(Integer.parseInt(str1.replaceAll("\\D",""))
                +Integer.parseInt(str2.replaceAll("\\D",""))+

                Integer.parseInt(str3.replaceAll("\\D","")));






    }
}
