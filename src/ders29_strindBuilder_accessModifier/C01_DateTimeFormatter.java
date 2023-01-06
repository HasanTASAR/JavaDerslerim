package ders29_strindBuilder_accessModifier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_DateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime zaman=LocalDateTime.now();//2022-11-04T21:07:23.934904600
        System.out.println(zaman);

        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("dd/MM/YYYY");//04/11/2022
        System.out.println(zaman.format(dtf1));

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("d:MMM:YY");
        System.out.println(zaman.format(dtf2));//4:Kas:22

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("d.MMMM.YYYY.EEEE");
        System.out.println(zaman.format(dtf3));//4.Kasım.2022.Cuma

    }
}
