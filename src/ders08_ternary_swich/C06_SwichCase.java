package ders08_ternary_swich;

public class C06_SwichCase {
    public static void main(String[] args) {
        // kullanıcının girdiği gün ismini yazdırın
        int gunNo=3;
        if (gunNo==1) {
            System.out.println("Pazartesi");
        }
        else if (gunNo==2) {
            System.out.println("Salı");
        }
        else if (gunNo==3) {
            System.out.println("Çarşamba");
        }else if (gunNo==4) {
            System.out.println("Perşembe");

        }else if (gunNo==5) {
            System.out.println("Salı");
        }else if (gunNo==6) {
            System.out.println("Cumartesi");
        }else {
            System.out.println("Pazar");
        }
        switch (gunNo){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Geçersiz Gün");
        }
    }
}
