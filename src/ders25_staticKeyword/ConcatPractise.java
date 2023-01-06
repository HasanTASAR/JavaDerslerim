package ders25_staticKeyword;

import java.util.Arrays;

public class ConcatPractise {
    public static void main(String[] args) {

        String str1 = "Ali Kaya";
        String str2 = "Mehmet Yılmaz";
        String str3 = "Ayşe Öztürk";
        String str4 = "Fatma Karaca";
        String okul = "Ankara Fen Lisesi";



        System.out.println(str1 + "/" + okul + "\n" + str2 + "/" + okul + "\n" + str3 + "/" + okul + "\n" + str4 + "/" + okul);
        System.out.println(str1.concat("/"+okul) + "\n" + str2.concat("/"+okul) + "\n" + str3.concat("/"+okul) + "\n" + str4.concat("/"+okul));


        String [] ogrenciArr = {"Ali Kaya", "Mehmet Yılmaz", "Ayşe Öztürk", "Fatma Karaca"};


        for (int i = 0; i < ogrenciArr.length; i++) {

           ogrenciArr[i] = okul+ " / "+ ogrenciArr[i];
        }
        System.out.print(Arrays.toString(ogrenciArr));
    }
}