// Kullanıcıdan alınan  sınır sayıya kadar 4 ve 5 in üssünü alma programı

import java.util.Scanner;

public class GirisiYapilanSayiyaKadar4ve5UssuAlma {
    public static void main(String[] args) {
        // girdiyi alalım
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır değeri giriniz: ");
        int number = input.nextInt();

        // 4 ün üstlerini hesaplayıp ekrana yazdır
        System.out.println("Girilen sınır değere gören 4 ün üsleri");
        for (int i = 1; i <= number; i *= 4) {
            System.out.println(i);

        } // 5 in üstlerini hesaplayıp ekrana yazdır
        System.out.println("-----------------------------\nGirilen sınır değere gören 5 in üsleri");
        for (int i = 1; i <= number; i *= 5) {
            System.out.println(i);
        }
    }
}