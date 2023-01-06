package ders06_IfElseStatement;

import java.util.Scanner;

public class C04_IfElseStatements {
    public static void main(String[] args) {
        //Kullanıcıdan bir karakter isteyelim
        //harfin büyük olup olmadığını yazıralım

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir Karakter Girin:");
        char krk=scan.next().charAt(0);
        if (krk>='A' && krk<='Z') {
            System.out.println("Büyük Harf!");}
        else {
            System.out.println("Büyük Harf Değil!");}

    }
}
