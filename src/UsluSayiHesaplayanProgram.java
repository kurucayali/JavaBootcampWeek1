//Kullanıcıdan iki sayı alınacaktır. Üssü alınacak sayı ve üssü. Sonra hesaplanığ çıktı verilecektir.

import java.util.Scanner;

public class UsluSayiHesaplayanProgram {
    public static void main(String[] args) {

        // değişkenlerimizi oluşturalım
        int n, k;

        // girdilerimizi alalım
        Scanner input = new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz.: ");
        n = input.nextInt();

        System.out.print("Üs sayıyı giriniz.: ");
        k = input.nextInt();

        int result = 1;
        //Döngüyle üssü kadar çarpma işlemi yaparak sonucu hesaplayalım
        for (int i = 1; i <= k; i++) {
            result *= n;
        }
        System.out.print(n + "^" + k + " = " + result);
    }
}

