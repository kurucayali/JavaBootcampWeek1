/*
Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters
üçgen çizen programı yazın. Ödev örneğinde verildiği gibi dik üçgen oluşturuyoruz.
 */

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan step sayısını al
        System.out.print("Basamak Sayısı: ");
        int step = input.nextInt();

        // Ters üçgeni oluştur
        for (int i = step; i >= 1; i--) {
            // Her satırda (2*i-1) adet yıldız yazdır
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Bir sonraki satıra geç
            System.out.println();
        }

    }
}
