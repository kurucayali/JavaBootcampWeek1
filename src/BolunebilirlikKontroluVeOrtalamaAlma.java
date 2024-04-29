/* Kullanıcıdan bir sayı girmesini istiyoruz. 0 dan girilen sayıya (number) kadar olan sayılar arasından
3 ve 4 e tam bölünebilenlerin ortalaması alıyoruz.
**/

import java.util.Scanner;

public class BolunebilirlikKontroluVeOrtalamaAlma {
    public static void main(String[] args) {

        //Kullanıcıdan bir sayı alınır
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();
        // Değişkenler tanımlanır
        int total = 0;
        int count = 0;
        // 0'dan başlayarak kullanıcının girdiği sayıya kadar olan sayıları kontrol et
        for (int i = 0; i <= number; i++) {
            //// Eğer sayı 3'e ve 4'e bölünebiliyorsa
            if (i % 3 == 0 && i % 4 == 0) {
                total += i; // Toplamı güncelle
                count++;    // Adeti güncelle
            }
        }
        // Eğer 0 dan "number"a kadar bölünebilen sayı varsa, ortalamayı hesapla ve yazdır. Yoksa hata ver
        if (count > 0) {
            double avg = (double) total / count;
            System.out.println("3'e ve 4'e bölünebilen sayıların ortalaması: " + avg);
        } else {
            System.out.println("Girdiğiniz aralıkta 3'e ve 4'e bölünebilen bir sayı yok.");
        }

    }
}
