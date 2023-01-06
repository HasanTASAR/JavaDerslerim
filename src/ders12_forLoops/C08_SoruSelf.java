package ders12_forLoops;

import java.util.Scanner;

public class C08_SoruSelf {
    public static void main(String[] args) {
        //2- Kullanicidan pozitif bir tamsayi alin,
        // 1’den girilen sayiya kadar(girilen sayidahil) 7 ila bolunebilen sayilari yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen 3 basamaklı bir sayı giriniz:");
        int sayi=scan.nextInt();

        for (int i = 1; i <= sayi ; i++) {
            if (i%7==0) System.out.println(i);
        }

    }
}
