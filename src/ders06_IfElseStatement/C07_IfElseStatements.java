package ders06_IfElseStatement;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {

        //Kullanıcıdan bir harf alalım,
        //Harf küçükse büyük olarak yazıralım, yoksa onu yazdıralım

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir Karakter Girin:");
        char krk=scan.next().charAt(0);

        if (krk>='a' && krk<='z') {
            System.out.println((char)(krk-32));}

        else {
            System.out.println(krk);}

    }

}
