/*
 Kombinasyon hesaplama programı.
 N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların
 sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
 Kombinasyon formülü // C(n,r) = n! / (r! * (n-r)!)
*/

import java.util.Scanner;

public class KombinasyonHesabi {
    public static void main(String[] args) {

        //Girdileri alalım.
        Scanner input = new Scanner(System.in);

        System.out.print("n değerini girin: ");
        int n = input.nextInt();

        System.out.print("r değerini girin: ");
        int r = input.nextInt();

        // r, n'den büyükse uyarı ver ve işlemi yapma. Çünkü r n den büyük olamaz.
        if (r > n) {
            System.out.println("Hata: r, n'den büyük olamaz!");
        } else {
            // Kombinasyon hesaplaması için faktöriyel işlemleri.
            int nFact = 1;
            for (int i = 1; i <= n; i++) {
                nFact *= i;
            }

            int rFact = 1;
            for (int i = 1; i <= r; i++) {
                rFact *= i;
            }

            int nMinusRFact = 1;
            for (int i = 1; i <= (n - r); i++) {
                nMinusRFact *= i;
            }

            int kombinasyon = nFact / (rFact * nMinusRFact);

            System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);

        }
    }
}

