package ders39_abstractClass;

public abstract class Araba {

    //Araba class'ini inherite eden tüm classlar motor,
    //kasa ve tekerlek metodlarını owerride etmek zorunda kalsın
    // ancak abs, klima metodları opsiyonel olsun,
    // isteyen chil metodları override etsin, üsteyen etmesin

    public abstract void motor();

    public abstract void marka();

    public abstract void kasa();

    public abstract void tekerlek();

    public void abs(){
        System.out.println("Güvenlik için abs önemlidir");
    }

    public void klima(){
        System.out.println("klima konforu artırır");
    }
}
