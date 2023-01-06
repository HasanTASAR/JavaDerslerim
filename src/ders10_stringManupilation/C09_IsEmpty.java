package ders10_stringManupilation;

public class C09_IsEmpty {
    public static void main(String[] args) {
        String str="";
        System.out.println(str.isEmpty());// true
        str="   ";
        System.out.println(str.isEmpty());// false
        System.out.println(str.isBlank());//true
        
    }
}
