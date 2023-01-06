package ders08_ternary_swich;

import java.util.Scanner;

public class C11_Tenary {
    public static void main(String[] args) {
        //Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Notunuzu Giriniz:");
        int not= scan.nextInt();

        System.out.println(not>0 && not<100 && not>50 ? "Tebrikler Sınıfı Geçtin" : "Maalesef Sınıfta Kaldın"
        );
    }
}
