package ders04_matematikselislemler_incrementDecrement;

public class C07_Pre_Post_Decrement {
    public static void main(String[] args) {

        int a=10;
        int b= a++;
        int c= ++b;
        System.out.println("a:"+a+",b:"+b+",c:"+c);

        a=20;
        b=++a;
        c=b++;
        System.out.println("a:"+a+",b:"+b+",c:"+c);

        a=30;
        System.out.println(a++);// 
    }



}