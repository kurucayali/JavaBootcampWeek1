import java.util.Scanner;
public class UcgenCevreVeAlanHesabi {
    public static void main(String[] args){
        // Değişkenleri oluştur.
        int a,b,c,d;
        double e,u;

        //Kullanıcıdan inputları al.

        Scanner input= new Scanner (System.in);
        System.out.print("1. kenarı giriniz..:");
        a=input.nextInt();

        System.out.print("2. kenarı giriniz..: ");
        b=input.nextInt();

        System.out.print("3.kenarı giriniz..:");
        c=input.nextInt();

        //Formülleri oluştur
        d= a + b + c ;
        u= d/2;
        e =Math.sqrt(u* (u-a)* (u-b) * (u-c));

        //Çıktıları ver
        System.out.println("Çevresi..:"+ d );
        System.out.println("Ücgenin Alanı..:"+ e );

    }
}
