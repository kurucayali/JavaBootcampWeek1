import java.util.Scanner;
public class KdvOraniHesap {
    public static void main(String[] args) {

        // değişkenleri tanımla
        double tutar, kdvOran, kdvTutar, toplamTutar, sonuc;

        // Ücret input değerini al
       Scanner input = new Scanner (System.in);
       System.out.print("Ücret Tutarını Giriniz: ");
       tutar = input.nextDouble();

       /* Ücret değeri 1000 ve üzeri ise True, 1000 altında bir değerse False çıktısı alınır.
       bu çıktıya göre sonuc denkleminde kdvOranı belirlenir.*/
       boolean kosul= tutar >= 1000;
       sonuc= kosul ? (kdvOran=0.08) : (kdvOran=0.18);

       // Kdv Tutar işlemleri yapılır.
       kdvTutar = tutar * kdvOran;
       toplamTutar = kdvTutar + tutar ;

       // Değerler ekrana yazdırılır.
       System.out.println("KDV'siz Fiyat..:" + tutar);
       System.out.println("KDV Oranı..:" + kdvOran);
       System.out.println("KDV Tutarı..: " + kdvTutar);
       System.out.println("KDV'li Fiyat..: " + toplamTutar);



    }
}