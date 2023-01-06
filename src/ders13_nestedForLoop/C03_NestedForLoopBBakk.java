package ders13_nestedForLoop;

public class C03_NestedForLoopBBakk {
    public static void main(String[] args) {
        // 1-4 arasındaki sayılar için çarpım tablosu

        // dış döngü satır kontrol eder

        for (int i = 1; i <= 4; i++) {

            // iç döngü her sütun değerleri kontrol eder,
            for (int j = 1; j <= 4; j++) {
                System.out.print(i*j+" ");
            }
            // iç döngü bitince alt satıra indirmek gereki "" hiçlik ile+
            System.out.println("");
        }
    }
}
