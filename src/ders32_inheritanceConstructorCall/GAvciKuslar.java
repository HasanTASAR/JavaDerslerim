package ders32_inheritanceConstructorCall;

public class GAvciKuslar extends FKuslar{
    public static void main(String[] args) {
        GAvciKuslar avci1=new GAvciKuslar();

        FKuslar avci=new GAvciKuslar();


        EHayvanlar avci2=new GAvciKuslar();

        /*
        Bir child clasda obje oluşturmak için chil klas constructrı kullanılır

        Ama data türünü  o objeyi bağı olduğu claslardan seçebiliriz

        Eğer constructor ve data turu farkli secilirse bu durumda clas üyesi olan
        veriiable ve metodlar farklı davranışlar gösterirler
         */
        String str= new String("Kus ");

    }
}
