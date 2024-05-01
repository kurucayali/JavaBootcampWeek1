//Döngüler ile fibonacci serisi bulan program yazıyoruz.
//Fibonacci serisinin eleman sayısını kullanıcıdan alıyoruz

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan Fibonacci serisinin eleman sayısını al
        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int n = input.nextInt();

        int a = 0, b = 1;
        System.out.print("Fibonacci serisi: ");

        // Fibonacci serisini oluştur ve ekrana yazdır
        for (int i = 1; i <= n; ++i) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }

    }
}
