import java.util.Scanner;

public class CinZodyagiBurcHesabi {
    public static void main(String[] args) {
        int birthdate, result;
        // Kullanıcıdan yıl bilgisini al.
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz.: ");
        birthdate = input.nextInt();
        // Kalan hesaplama
        result=birthdate%12;

        //Yukarıdaki işlemin sonucuna göre burcun belirlenmesi. eğer "-" li bir değer girilirse hata mesajı verecek.
        switch(result){
            case 1 :
                System.out.print("Çin Zodyağı Burcunuz : Horoz");
                break;
            case 2 :
                System.out.print("Çin Zodyağı Burcunuz : Köpek");
                break;
            case 3 :
                System.out.print("Çin Zodyağı Burcunuz : Domuz");
                break;
            case 4 :
                System.out.print("Çin Zodyağı Burcunuz : Fare");
                break;
            case 5 :
                System.out.print("Çin Zodyağı Burcunuz : Öküz");
                break;
            case 6 :
                System.out.print("Çin Zodyağı Burcunuz : Kaplan");
                break;
            case 7 :
                System.out.print("Çin Zodyağı Burcunuz : Tavşan");
                break;
            case 8 :
                System.out.print("Çin Zodyağı Burcunuz : Ejdarha");
                break;
            case 9 :
                System.out.print("Çin Zodyağı Burcunuz : Yılan");
                break;
            case 10 :
                System.out.print("Çin Zodyağı Burcunuz : At");
                break;
            case 11 :
                System.out.print("Çin Zodyağı Burcunuz : Koyun");
                break;
            default:
                System.out.print("Yıl bilgisini hatalı girdiniz!");


        }





    }
}
