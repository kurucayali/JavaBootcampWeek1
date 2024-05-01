/*
Kullanıcıdan aldığımız değere göre * larla elmas deseni çizeceğiz. Bir üçgen ve bir ters üçgenin
birleşimi şeklinde olacak. Kullanıcıdan aldığımız değer merkeze kadar olan satır sayısını belirleyecek.
*/

import java.util.Scanner;

public class YildizlarlaElmasYapimi {
    public static void main(String[] args) {
        //Kullanıcıdan girdi alıyoruz.
        Scanner input = new Scanner(System.in);
        System.out.print("Elmasın merkez satır sayısını giriniz.: ");
        int n = input.nextInt();

        // ilk for döngüsü ile birinci üçgeni oluşturuyoruz.
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        // ikinci for döngüsü ile ters üçgeni bunun altına bağlıyoruz.

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}

