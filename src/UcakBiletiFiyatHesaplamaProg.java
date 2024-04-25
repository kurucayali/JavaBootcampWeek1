/*
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM),
yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
ksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
 */

import java.util.Scanner;

public class UcakBiletiFiyatHesaplamaProg {
    public static void main(String[] args) {
//Değişkenleri tanımlayalım
        int mesafe, yas, yolculukTipi;
        double birimFiyat = 0.10, toplamFiyat;

//Kullanıcıdan giriş değerlerini alalım.
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi giriniz (km)..: ");
        mesafe = input.nextInt();
        System.out.print("Yaşı giriniz: ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        yolculukTipi = input.nextInt();


// Veri doğruluğunu kontrol edelim.

        if ((yolculukTipi != 1 && yolculukTipi != 2) || yas <= 0 || mesafe <= 0) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {

            toplamFiyat = mesafe * birimFiyat;

            // İndirimleri uygula

            // 12 yaşından küçükse %50 indirim
            if (yas < 12) {
                toplamFiyat = toplamFiyat * 0.50;

            // 12-24 yaş arası ise %10 indirim

            } else if (yas >= 12 && yas <= 24) {
                toplamFiyat = toplamFiyat * 0.90;

            // 65 yaşından büyükse %30 indirim

            } else if (yas >= 65) {
                toplamFiyat = toplamFiyat * 0.70;
            }

            // Gidiş-dönüş ise %20 indirim

            if (yolculukTipi == 2) {
                toplamFiyat = toplamFiyat * 0.80 * 2;
            }

            // Sonuçları ekrana yazdır
            System.out.printf("Toplam Tutar: " + toplamFiyat + "TL");
        }


    }
}
