// Kullanıcıdan alınan n değeri kadar satır büyüklüğünden * lardan üçgen oluşturma programı

import java.util.Scanner;

public class YildizlarlaUcgenYapimi {
    public static void main(String[] args) {
        //Kullanıcıdan girdiyi alalım.
        Scanner input = new Scanner(System.in);
        System.out.print("Üçgen için satır sayısı giriniz.:");
        int n = input.nextInt();
        // for döngüsüyle hem üçgenin boşluğunu hemde * ları belirleyelim.
        for (int i = 0; i <= n; i++) {
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
