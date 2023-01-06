package ders04_matematikselislemler_incrementDecrement;

public class C06_Pre_Post_Increment {
    public static void main(String[] args) {

        int a=10;
        //a variablenin değerini yazdırıp, sonra a'nın değerini artırın
        System.out.println("a:"+a);
        a++;

        int b=10;
        //b variablenin değerini artırıp, sonra yazdıralım
        b++;
        System.out.println("b:"+b);

        int c=10;
        //c variablenin değerini yazdır, sonra artırır
        System.out.println("c:"+ c++);

        int d=10;
        // d variablenin değerini önce artır, sonra yazdır
        System.out.println("d:"+ ++d);



    }

}
