package ders11_stringManupilations;

public class C05_Repeat_Trim {
    public static void main(String[] args) {

        String str="Java Güzeldir\n";// eğer "Java Güzeldir\n" dersek altalta yazdırır
        str=str.repeat(4);
        System.out.println(str);


        String str1="      Java Güzeldir    "; // trim başta ve sondaki boşlukları alır
        str1=str1.trim();
        System.out.println(str1);

    }
}
