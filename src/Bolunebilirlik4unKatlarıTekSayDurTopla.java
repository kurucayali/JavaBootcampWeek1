/*
tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve  girilen değerlerden
çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz
*/

import java.util.Scanner;

public class Bolunebilirlik4unKatlarıTekSayDurTopla {
    public static void main(String[] args) {
        // değişkenleri tanımlayalım
        int total = 0; // Toplamı tutmak için değişken
        int n; // Girişi yapılan sayı

        // Kullanıcı girdisi alalım
        Scanner input = new Scanner(System.in);
        // Kullanıcı tek bir sayı girene kadar girişleri kabul et
        while (true) {
            System.out.print("Bir sayı giriniz: ");
            n = input.nextInt();

            // Eğer kullanıcı tek bir sayı girdiyse döngüyü sonlandır
            if (n % 2 == 1) {
                break;
            }

            // Girilen sayı 4'e tam bölünüyorsa, toplama ekle
            if (n % 4 == 0) {
                total += n;
            }
        }
        // Toplamı ekrana yazdır
        System.out.println("Girişi yapılan sayılardan 4'e tam bölünenlerin toplamı: " + total);
    }
}

