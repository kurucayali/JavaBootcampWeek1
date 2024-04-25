
// switch-case yapısı ile hesap makinesi yapımı

import java.util.Scanner;
public class HesapMakinesiProgrami {
    public static void main(String[] args) {
        //Kullanıcıdan alacağımız değerleri, yapılacak seçimi ve işlem sonucu değişkenlerini tanımlayalım.
        int select;
        double n1, n2, result;

        // Sayıları ve yapılacak işlemin girdisini alalım.
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz..: ");
        n1 = input.nextInt();
        System.out.print("2.Sayıyı giriniz..:");
        n2 = input.nextInt();

        //select değişkenine integer girdi alabilmek için sayılara karşılık gelen işlemleri kullanıcıya tanıttık.
        System.out.println("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");
        System.out.print("İşlem seçiniz..: ");
        select = input.nextInt();

        //switch case yapısını oluşturuyoruz. Seçilmesi istenen değerler dışında seçim yapılırsa uyaracak.
        //0 ile bölme işlemi yapılmasına izin vemeyecek.
        switch (select) {
            case 1:
                result = n1 + n2;
                System.out.print("Toplama Sonucu..:" + result);
                break;
            case 2:
                result = n1 - n2;
                System.out.print("Çıkarma Sonucu..:" + result);
                break;
            case 3:
                result = n1 * n2;
                System.out.print("Çarpma Sonucu..:" + result);
                break;
            case 4:
                switch ((int) n2) {
                    case 0:
                        System.out.println("Hata: Bölen sıfır olamaz!");
                        break;
                    default:
                        result = n1 / n2;
                        System.out.println("Bölme sonucu: " + result);
                        break;
                }
                break;

            default:
                System.out.println("Geçersiz seçim! Lütfen 1-4 arasında bir seçim yapınız.");
                break;


        }

    }
}
