import java.util.Scanner;
public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        //Değişkenleri tanımla
        double boy, vki;
        int kilo;
        //inputları al
        Scanner input= new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz ..: ");
        boy=input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz..:");
        kilo=input.nextInt();
        //Formulü tanımla, Kilo (kg) / Boy(m) * Boy(m)
        vki= kilo / (boy * boy);
        //çıktı ver
        System.out.print("Vücut Kitle İndeksiniz..:"+vki);
    }
}
