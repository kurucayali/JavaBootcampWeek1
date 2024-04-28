/*
Artık yıl hesaplama uygulaması. Kullanıcıdan yıl girdisi alınacak.
Artık yıl olup olmadığı bilgisi verilecektir.
 */

import java.util.Scanner;
public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl giriniz :");
        year= input.nextInt();

        if (year % 400 == 0 ){
            System.out.print(year + ( " bir artık yıldır." ));
        } else if (year %100 != 0 && year %4 ==0 ){
            System.out.print(year+" bir artık yıldır.");
        } else if (year < 0 ){
            System.out.print(" Lütfen M.S. bir tarih için işlem yapınız :) ");
        }else {
            System.out.print(year + " bir artık yıl değildir.");
        }
    }
}
