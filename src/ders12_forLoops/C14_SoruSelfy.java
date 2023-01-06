package ders12_forLoops;

import java.util.Scanner;

public class C14_SoruSelfy {
    public static void main(String[] args) {

        // Soru 8 (interview)- Kullanicidan pozitif bir sayi alin,
        // 1’den baslayarak tum tamsayilari yazdirin, sira
        // - 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        //- 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        // - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzzyazdirin

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz:");
        int sayi=scan.nextInt();

        for (int i = 1; i <= sayi ; i++) {

            if(i%3==0 && i%5==0) {
                System.out.println(i+" Hem 3'e, Hemde 5'e bölünen sayı");
            }
            else if (i%5==0) {
                System.out.println(i+" 5'e bölünen sayı");
            }
            else if (i%3==0) {
                System.out.println(i+" 3'e bölünen sayı");
            }
            else {
                System.out.println(i);
            }

        }

    }
}
