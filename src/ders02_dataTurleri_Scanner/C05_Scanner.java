package ders02_dataTurleri_Scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan ismini alıp büyük harflerle yazalım

        //1. adım: scan objesi oluşturma
        Scanner scan= new Scanner(System.in);

        //2. adım: kullanıcıya ne istediğimizi yazdırma
        System.out.println("lütfen Adınızı Giriniz:");

        //3. adım: kullanıcıdan istediğimiz veri türüne uygun bir veriable scanner metodlerından uygun olanını
        // kullanarak alınan değeri variableye atayalım
        String kullaniciAdi= scan.nextLine();

        System.out.println(kullaniciAdi.toUpperCase());
    }
}
