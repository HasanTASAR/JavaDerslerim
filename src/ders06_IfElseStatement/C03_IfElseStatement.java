package ders06_IfElseStatement;

import java.util.Scanner;

public class C03_IfElseStatement {
    public static void main(String[] args) {
        //kullanıcıdan üçgenin kenarlarını alın, üç kenar eşit ise Eşkenar Üçgen yazırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Üçgenin Kenar Ölçülerini Yazınız:");
        int kenar1=scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3 && kenar1>0 && kenar2>0 && kenar3>0) {
            System.out.println("Eşkenar Üçgen!"); }

        else {
            System.out.println("Eşkenar Değil");}

    }
}
