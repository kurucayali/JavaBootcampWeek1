import java.util.Scanner;
/* Boy ve kilo bilgileri kullanıcıdan alacağız
Vücut kitle indeksi hesaplama uygulaması yapacağız. */

public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        //Değişkenleri tanımlayalım. vki=vücütkitleindeksi
        double boy, vki;
        int kilo;
        //inputları alalım
        Scanner input= new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz ..: ");
        boy=input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz..:");
        kilo=input.nextInt();
        //Formulü tanımlayalım, Kilo (kg) / Boy(m) * Boy(m)
        vki= kilo / (boy * boy);
        //sonuçları verelim
        System.out.print("Vücut Kitle İndeksiniz..:"+vki);
    }
}
