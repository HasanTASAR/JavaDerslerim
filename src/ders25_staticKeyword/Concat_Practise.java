package ders25_staticKeyword;

import java.util.Arrays;

public class Concat_Practise {

    public static void main(String[] args) {

        String [] okulListe= {"Ali Kaya", "Mehmet Yılmaz", "Ayşe Öztürk", "Fatma Karaca"};
        String okul = "Ankara Fen Lisesi";


        for (int i = 0; i < okulListe.length ; i++) {

            okulListe[i]=okul+" / "+okulListe[i];

        }
        System.out.println(Arrays.toString(okulListe));

    }
}
