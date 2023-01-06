package ders12_forLoops;

public class C04_RakamlarToplami {
    public static void main(String[] args) {


        //kullanıcının verdiği sayının rakamlar toplamını bulunuz
        int sayi=1453;
        String sayistr=""+sayi;
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        for (int i = 1; i <=sayistr.length() ; i++) {

            birlerBasamagi=sayi%10;
          rakamlarToplami=rakamlarToplami+birlerBasamagi;
            sayi=sayi/10;

        }
        System.out.println(rakamlarToplami);
    }
}
