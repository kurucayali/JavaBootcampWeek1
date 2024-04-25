import java.util.Scanner;
public class ManavKasaProrami {
    public static void main(String[] args) {
        //değişkenleri oluştur
        //sabit değerler
        double armut=2.14, elma=3.67 , domates=1.11, muz= 0.95, patlıcan=5.00;
        //ürünün ilk harfine atanan değişken kilo miktarına eşitlenecek
        double a,e,d,m,p,toplam;

        //inputları al
        Scanner input= new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ?..:");
        a=input.nextDouble();
        System.out.print("Elma Kaç Kilo ?..:");
        e=input.nextDouble();
        System.out.print("Domates Kaç Kilo ?..:");
        d=input.nextDouble();
        System.out.print("Muz Kaç Kilo ?..:");
        m=input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ?..:");
        p=input.nextDouble();

        //denklemleri kur
        toplam= (elma*e)+(armut*a)+(domates*d)+(muz*m)+(patlıcan*p);

        //çıktı ver

        System.out.print("Toplam Tutar : "+ toplam);
    }
}
