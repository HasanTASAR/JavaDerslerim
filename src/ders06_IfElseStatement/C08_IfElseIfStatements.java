package ders06_IfElseStatement;

import java.util.Scanner;

public class C08_IfElseIfStatements {
    public static void main(String[] args) {
        //kullanıcıdan üçgenin kenarlarını alın,
        //kenarla 0 veya negatifse geçersiz kenar uzunluğu
        //üç kenar eşit ise Eşkenar Üçgen yazırın
        //değilse Eşkenar değil

        Scanner scan=new Scanner(System.in);
        System.out.println("Üçgenin Kenar Ölçülerini Yazınız:");
        int kenar1=scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        if (kenar1<=0 || kenar2<=0 || kenar3<=0 ) {
            System.out.println("Geçersiz Giriş");}
        else if (kenar1==kenar2 && kenar2==kenar3) {
            System.out.println("Eşkenar Üçgen!");}
        else {
            System.out.println("Eşkenar Değil!");}


        }

}
