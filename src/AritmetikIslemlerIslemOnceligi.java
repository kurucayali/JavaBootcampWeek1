/*
Kullanıcıdan 3 tane sayı (a, b, c) alıp bu sayıları işlem sırasına göre işleyen bir program yazın.
İşlem sırası şöyle olsun: a+b*c-b. İşlem tamamladıktan sonra sonucu ekrana yazdırın.
*/
import java.util.Scanner;
public class AritmetikIslemlerIslemOnceligi {
    public static void main(String[] args) {
        //Değişkenleri tanımlayalım
        int a,b,c;

        //Değerleri programa girdi olarak alalım.
        Scanner input= new Scanner(System.in);

        System.out.print("a değerini giriniz..: ");
                a=input.nextInt();
        System.out.print("b değerini giriniz..: ");
                b=input.nextInt();
        System.out.print("c değerini giriniz..: ");
                c=input.nextInt();
        //Denklemi tanımlayalım.
        int result = a+b*c-b;
        //Sonucu yazdıralım.
        System.out.print("İşlem sonucu..:"+ result );


    }
}
