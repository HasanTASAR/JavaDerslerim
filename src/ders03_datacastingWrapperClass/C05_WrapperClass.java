package ders03_datacastingWrapperClass;

public class C05_WrapperClass {
    public static void main(String[] args) {


        int sayi=10;
        String str= "Java Çok Güzel";
        //Pimitive data türleri sadece değer barındırırı hazır metodu yoktur
        //Java'ya yapılan taleoler sonucunda pirimitive data türleri ile bazı hazır metodların kullanılabilmesi için
        //wrapper Class'lar oluşturmuştur
        //
        //
        char krk='b';
        Character krkWrapper='c';
        System.out.println(Character.isLetter('5'));//false
        System.out.println(Character.isDigit('7'));// true
        String str1="123";
        String str2="12";
        // str1 ve str2 değerlerini matematiksel olarak toplayın
        System.out.println(str1+str2);

        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));

        //Integer.parseTnteger(str) içine yazılan strrakamlardan oluşuyorsa str'i int'a çevirir.
        // ancak bir karakter bile rakam değilse hata verir



    }

}
