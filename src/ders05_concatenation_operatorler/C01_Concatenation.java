package ders05_concatenation_operatorler;

public class C01_Concatenation {
    public static void main(String[] args) {
        //sadece aşağıda verilenlerle istenen değere ulaşalım

        String s1="Java";
        String s2="Güzeldir";
        String s3="";
        String s4=" ";

        int sayi1=4;
        int sayi2=3;

        //7Java GÜzeldir
        System.out.println(sayi1+sayi2+s1+s4+s2);

        //34 Java
        System.out.println(""+sayi2+sayi1+s4+s1);

        //7Java Güzeldir
        System.out.println(sayi1+sayi2+s1+s4+s2);

        //Java7 Güzeldir43
        System.out.println(s1+(sayi1+sayi2)+s4+s2+sayi1+sayi2);

    }

}
