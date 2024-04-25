
//Manavdan satın alınan ürünlerin toplam tutarını hesaplayan program
import java.util.Scanner;
public class ManavKasaProrami {
    public static void main(String[] args) {
        //değişkenleri oluşturalım
        //fiyat bazlı sabit değerler
        double armut=2.14, elma=3.67 , domates=1.11, muz= 0.95, patlıcan=5.00;
        //ürünlerin kilo miktarına değişken atayalım
        double perArmut,perElma,perDomates,perMuz,perPatlıcan,toplam;

        //her ürün için inputları alalım
        Scanner input= new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ?..:");
        perArmut=input.nextDouble();
        System.out.print("Elma Kaç Kilo ?..:");
        perElma=input.nextDouble();
        System.out.print("Domates Kaç Kilo ?..:");
        perDomates=input.nextDouble();
        System.out.print("Muz Kaç Kilo ?..:");
        perMuz=input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ?..:");
        perPatlıcan=input.nextDouble();

        //denklemi kurup toplam fiyatı hesaplayalım
        toplam= (elma*perElma)+(armut*perArmut)+(domates*perDomates)+(muz*perMuz)+(patlıcan*perPatlıcan);

        //sonuç çıktısını verelim

        System.out.print("Toplam Tutar : "+ toplam+"TL");
    }
}
