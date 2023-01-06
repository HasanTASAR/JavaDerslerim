package ders06_IfElseStatement;

public class C09_IfElseIfStatemens {
    public static void main(String[] args) {
        //bir tam sayı alı n
        //negatifse ''GeçersizSayı'
        //Tek basamaklı ise 'rakam'
        //iki basmaklı ise'' İki basmaklı''
        // bunu dışındakiler ise 'büyük sayı' yazdır

        int sayi=12;
        if (sayi<0){
            System.out.println("Geçersiz Sayı"); }
        else if (sayi<10){
            System.out.println("Rakam");
        }
        else if (sayi<100) {
            System.out.println("İki basamaklı Sayı");
        }
        else {
            System.out.println("Büyük sayı");
        }
    }
}
