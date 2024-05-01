// Kullanıcıdan aldığımız değerlerde tip dönüşümü yapan basit bir uygulama yazıyoruz.
import java.util.Scanner;
public class TipDegistir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan bir tam sayı ve bir ondalıklı sayı girmesini istiyoruz
        System.out.print("Bir tam sayı giriniz: ");
        int tamSayi = input.nextInt();

        System.out.print("Bir ondalıklı sayı giriniz: ");
        double ondalikliSayi = input.nextDouble();

        // Tam sayıyı ondalıklı sayıya dönüştürelim
        double tamSayiDouble = (double) tamSayi;

        // Ondalıklı sayıyı tam sayıya dönüştürelim
        int ondalikliSayiInt = (int) ondalikliSayi;

        // Sonuçları ekrana yazdırın
        System.out.println("Tam sayıyı ondalıklı sayıya dönüştürme: " + tamSayiDouble);
        System.out.println("Ondalıklı sayıyı tam sayıya dönüştürme: " + ondalikliSayiInt);

    }
}
