/*
Artık yıl hesaplama uygulaması. Kullanıcıdan yıl girdisi alınacak.
Artık yıl olup olmadığı bilgisi verilecektir.
 */

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {

        // Değişkeni tanımlıyoruz.
        int year;
        // Kullanıcıdan yıl bilgisini alıyoruz.
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl giriniz :");
        year = input.nextInt();

        //koşulları belirleyip o doğrultu da verilecek çıktıları oluşturuyoruz.

        if (year % 400 == 0) {
            System.out.print(year + (" bir artık yıldır."));
        } else if (year % 100 != 0 && year % 4 == 0) {
            System.out.print(year + " bir artık yıldır.");
        } else {
            System.out.print(year + " bir artık yıl değildir.");
        }
    }
}
