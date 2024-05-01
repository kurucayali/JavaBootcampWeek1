//Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu
// sayıları ekrana yazan programı yazın.

import java.util.Scanner;

public class MinMaxSayiBulma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan n adet sayı girmesini istiyoruz
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();

        // İlk sayıyı hem en büyük hem de en küçük sayı olarak başlatıyoruz
        System.out.print("1. Sayıyı giriniz: ");
        int number = input.nextInt();
        int min = number;
        int max = number;

        // Diğer sayıları kontrol ederek en büyük ve en küçük sayıları güncelliyoruz
        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            number = input.nextInt();
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        // Sonuçları ekrana yazdırıyoruz
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);


    }
}
