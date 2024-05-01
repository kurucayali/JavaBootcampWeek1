//Kullanıcıdan alınan iki değerin EBOB ve EKOK değerlerini bulan program yazıyoruz.
import java.util.Scanner;

public class EbobEkokbulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Kullanıcıdan girdiler alınır
        System.out.print("1. sayıyı giriniz: ");
        int n1 = input.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        int n2 = input.nextInt();

        int ebob = 1;
        int k = n1; // Başlangıç değeri olarak ilk sayı atanır
        while (k >= 1) { // k değeri 1 olana kadar döngü çalışır
            if (n1 % k == 0 && n2 % k == 0) { // n1 ve n2'nin k'ya tam bölünüp bölünmediği kontrol edilir
                ebob = k; // EBOB değeri k'ya atanır
                System.out.println("EBOB: " + ebob); // EBOB değeri ekrana yazdırılır
                break; // EBOB bulunduğunda döngüden çıkılır
            }
            k--; // k değeri azaltılır
        }

        int ekok = n1 * n2 / ebob; // EKOK değeri hesaplanır
        System.out.println("EKOK: " + ekok); // EKOK değeri ekrana yazdırılır
    }
}
