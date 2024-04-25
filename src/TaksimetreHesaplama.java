import java.util.Scanner;
public class TaksimetreHesaplama {
    public static void main(String[] args) {
        // değişkenleri tanımla
        int km;
        double perkm = 2.20, startprice = 10, total ;

        //km girdisini al
        Scanner input = new Scanner(System.in);
        System.out.print("Km değerini giriniz..: ");
        km = input.nextInt();

        total = startprice + (perkm * km );

        //koşulu oluştur boolean ifade
        total = (total <20 )? 20 : total ;

        //çıktı
        System.out.print("Ödenecek tutar..:" + total + "TL");

    }

}
