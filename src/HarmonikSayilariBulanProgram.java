// Kullanıcıdan alınan "number" değeri için harmonik toplam işlemi yapılacak ve ekrana sonuç verilecek.

import java.util.Scanner;

public class HarmonikSayilariBulanProgram {
    public static void main(String[] args) {
        // Kullanıcıdan girdi alalım.
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz.: ");
        int number = input.nextInt();
        double result = 0;
        //For döngüsü ile n e kadar olanların toplam denklemini kuralım.
        for(double i = 1; i<=number; i++ ){
            result +=(1/i);
        }
        //sonucu çıktı verelim
        System.out.print("İşlemin sonucu .: "+ result);

    }
}
