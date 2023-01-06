package ders11_stringManupilations;

public class C01_Nullpointer {
    public static void main(String[] args) {
        String str1="";
        //str'e değer atanmıştır.
        System.out.println(str1); // hiçlik yazdırır
        System.out.println(str1.concat("Java"));// Java
        String str2; // str2 oluşturuldu ama değer atanmadı, okumaz1
        //System.out.println(str2);// değeratanmadığı için yazdırılamaz. CTE verir
        //System.out.println(str2.concat("java")); değer olmadığı için concat la birleştiremez.

        String str3=null; //str3'e değer atanmadı,
        // biz bu şekilde değer atamadığımızın farkında olduğumuzu java'ya bildiriyoruz.

        System.out.println(str3.concat("Java")); //NullPointerException hatası verir
        System.out.println(str3 + "Java");

    }
}
