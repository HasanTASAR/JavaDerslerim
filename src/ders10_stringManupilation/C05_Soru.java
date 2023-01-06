package ders10_stringManupilation;

public class C05_Soru {
    public static void main(String[] args) {
        //mail kontrolü yapan bir program hazırlayın.
        //1.@ içermiyorsa "geçersiz email"
        //2.@gmail ile bitmiyorsa "gmail adresi girin"
        //3.@gmail.com ile bitmiyorsa yazim hatası"

        String email="ahmet@bulutluoz.com";
        if (!email.contains("@")) {
            System.out.println("Geçersiz email");}
        else if (!email.contains("@gmail.com")){
            System.out.println("@gmail.com");}

        else {
            System.out.println("Geçerli Giriş");
        }

    }
}
