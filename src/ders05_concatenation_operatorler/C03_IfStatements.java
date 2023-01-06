package ders05_concatenation_operatorler;

import java.util.Scanner;

public class C03_IfStatements {

    public static void main(String[] args) {
        //kullanıcıdan 2 sayı alın

        Scanner scan=new Scanner(System.in);
        int s1=scan.nextInt();
        int s2= scan.nextInt();

        //eğer ilk sayı ikinci sayıdan büyükse 'ilk sayı daha büyük' yazdırın
        if (s1>s2) {System.out.println("İlk sayı İkinci Sayıdan Büyüktür");}

        //eğer ikinci sayı çiftse 'ikinci sayı çift' yazdırın
        if (s2%2==0) {System.out.println("İkinci Sayı Çifttir");}

        //eğer birinci sayı büyükse 'ilk sayı 100'den büyük yazdırın
        if (s1>100) {System.out.println("İlk sayı 100'den büyüktür");}

        






    }
}
