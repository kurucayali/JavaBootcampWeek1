/*
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların)
toplamı kendisine eşit olan sayıya mükemmel sayı denir.
Sayının mükemmel olup olmadığını bildiren program yazıyoruz.
 */
import java.util.Scanner;
public class MukummelSayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan bir sayı girmesini istiyoruz
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        // Sayının kendisi hariç pozitif tam sayı çarpanları toplamını buluyoruz
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Toplamın girilen sayıya eşit olup olmadığını kontrol ediyoruz
        if (sum == number) {
            System.out.println(number + " Mükemmel sayıdır.");
        } else {
            System.out.println(number + " Mükemmel sayı değildir.");
        }
    }
}
