package ders03_datacastingWrapperClass;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {
        //kullanıcıdan bir tamsayı alın,
        //kullanıcı kaç girerse girsin -128 ile +127 arasında sonuç yazılsın
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir Tamsayı Giriniz");
        int girilensayi= scan.nextInt();
        byte sonuc=(byte) girilensayi;
        System.out.println("Dönüşen Değer:"+sonuc);











    }



}
