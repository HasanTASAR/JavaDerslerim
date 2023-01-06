package ders32_inheritanceConstructorCall;

public class DCamry extends BToyota {

    DCamry(String pc) {
        super("Deniz");
    }
    DCamry(){

    }


    public static void main(String[] args) {
        // Eğer kullanılan argumate uygun  bir parametre yoksa direk cte olur.

        DCamry camry2=new DCamry("celal");


        System.out.println("=======================");

        DCamry camry1=new DCamry();

        //Parametresiz araba constructor
        // Parametresiz Toyota Constructor

    }

}
