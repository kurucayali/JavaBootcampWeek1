
//kullanıcıdan bir değer alan ve rakamlarını toplayan program
import java.util.Scanner;

public class BasamakSayilarininToplami {
    public static void main(String[] args) {

        //Kullanıcıdan sayı alalım.
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        int total = 0;
        int remainder;
        //number 0 a eşit olana kadar her kalan bir basamak değerini verecek ve bunlar toplanacak.
        while (number != 0) {
            remainder = number % 10;
            total += remainder;
            number /= 10;
        }
        // Kullanıcıya çıktı verelim
        System.out.println("Basamaklarının toplamı: " + total);
    }
}
