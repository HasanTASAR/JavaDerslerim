package ders06_IfElseStatement;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {
        //kullanıcıdan üçgenin kenarlarını alın, üç kenar eşit ise Eşkenar Üçgen yazırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Üçgenin Kenar Ölçülerini Yazınız:");
         int kenar1=scan.nextInt();
         int kenar2= scan.nextInt();
         int kenar3= scan.nextInt();

         if (kenar1==kenar2 && kenar2==kenar3) {
             System.out.println("Eşkenar Üçgen!"); }


    }

}
