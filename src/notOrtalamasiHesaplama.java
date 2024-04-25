import java.util.Scanner;

public class notOrtalamasiHesaplama {
    public static void main(String[] args) {
        //Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

       //Scanner sınıfımızı tanımladık
        Scanner inp= new Scanner(System.in);

        //Kullanıcıdan değerleri al

        System.out.print("Matematik notunu giriniz:");
        mat = inp.nextInt();

        System.out.print("Fizik notunu giriniz:");
        fizik = inp.nextInt();

        System.out.print("Kimya notunu giriniz:");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunu giriniz:");
        turkce = inp.nextInt();

        System.out.print("Tarih notunu giriniz:");
        tarih = inp.nextInt();

        System.out.print("Müzik notunu giriniz:");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik );
                double sonuc = toplam / 6 ;

                System.out.println("Ortalamanız : " + sonuc);

                Boolean kosul1 = sonuc >= 60;
                String str = kosul1 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
                System.out.println(str);



    }
}