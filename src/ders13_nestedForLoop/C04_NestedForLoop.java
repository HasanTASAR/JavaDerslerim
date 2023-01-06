package ders13_nestedForLoop;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        //aşağıdaki şekli yazdıran bir kod
        /*
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
         */
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=6 ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
