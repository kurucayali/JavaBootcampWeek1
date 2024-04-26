/* Not ortalaması hesaplama programı.
Eğer ders notu için girilen değer 0-100 arasında değilse bu aralıkta değer girilene kadar tekrar isteyeceğiz.
 */
import java.util.Scanner;
public class SinifGeçmeDurumuHesaplama {
    public static void main(String[] args) {
        //değişkenleri tanımlayalım
        int mat, fizik, kimya, muzik, turkce;

        //Girdileri alalım.
        Scanner input = new Scanner(System.in);

        // Matematik notunu alalım
        System.out.print("Matematik Notunuzu giriniz..:");
        mat = input.nextInt();
        while (mat < 0 || mat > 100) {
            System.out.print("Geçersiz not! Lütfen 0-100 arasında bir not giriniz..:");
            mat = input.nextInt();
        }

        // Fizik notunu alalım
        System.out.print("Fizik Notunuzu giriniz..:");
        fizik = input.nextInt();
        while (fizik < 0 || fizik > 100) {
            System.out.print("Geçersiz not! Lütfen 0-100 arasında bir not giriniz..:");
            fizik = input.nextInt();
        }

        // Kimya notunu alalım
        System.out.print("Kimya Notunuzu giriniz..:");
        kimya = input.nextInt();
        while (kimya < 0 || kimya > 100) {
            System.out.print("Geçersiz not! Lütfen 0-100 arasında bir not giriniz.:");
            kimya = input.nextInt();
        }

        // Müzik notunu alalılm
        System.out.print("Müzik Notunuzu giriniz..:");
        muzik = input.nextInt();
        while (muzik < 0 || muzik > 100) {
            System.out.print("Geçersiz not! Lütfen 0-100 arasında bir not giriniz..:");
            muzik = input.nextInt();
        }

        // Türkçe notunu alalım
        System.out.print("Türkçe Notunuzu giriniz..:");
        turkce = input.nextInt();
        while (turkce < 0 || turkce > 100) {
            System.out.print("Geçersiz not! Lütfen 0-100 arasında bir not giriniz..:");
            turkce = input.nextInt();
        }

        //Ortalamayı hesaplayalım
        double avg = (mat + fizik + kimya + muzik+ turkce) / 5;


        //Ortalamaya göre çıktıları verelim
        if(avg <= 55){
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere");

        } else {
            System.out.print("Tebrikler.Sınıfı gectiniz ");
        }

        System.out.print("Ortalamanız : "+ avg);

    }
}
