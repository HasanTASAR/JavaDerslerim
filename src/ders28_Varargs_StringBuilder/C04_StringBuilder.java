package ders28_Varargs_StringBuilder;

public class C04_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(7);
        System.out.println(sb.capacity()); //7
        System.out.println(sb.length());// 0

        sb.append("Java");
        System.out.println(sb);// java
        System.out.println(sb.length()); //4
        System.out.println(sb.capacity());//7

        sb.append(" güzeldir");
        System.out.println(sb);
        System.out.println(sb.length()); //12
        System.out.println(sb.capacity());//16

        sb.append(" ona ne şüphe");
        System.out.println(sb.length()); //26
        System.out.println(sb.capacity());//34

        // kapasite ve lengthi eşitlemek için
        sb.trimToSize();
        System.out.println(sb.length()); //26
        System.out.println(sb.capacity());//26

    }
}
