package ders06_IfElseStatement;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {
        //Yaşa göre emeklilik olma durumunu sorgulayalım
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz:");
        double yas= scan.nextDouble();

        if (yas>=65) {
            System.out.println("Emekli Olabilirsiniz!");}
        else {
            System.out.println("Emekli olmak için "+ (65-yas)+" yıl daha çalışmalısınız"); }


    }

}
