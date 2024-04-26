import java.util.Scanner;

public class SayilariSiralamaKdenBye {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan üç sayıyı alalım
        System.out.print("1. sayıyı giriniz: ");
        a = input.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        b = input.nextInt();

        System.out.print("3. sayıyı giriniz: ");
        c = input.nextInt();

        // Sayıları sıralayalım. Çıktıyı değerlerle verelim.
        if (a <= b && a <= c) {
            if (b <= c) {
                System.out.print(a + "<" + b + "<" + c);
            } else {
                System.out.print(a + "<" + c + "<" + b);
            }
        } else if (b <= a && b <= c) {
            if (a <= c) {
                System.out.print(b + "<" + a + "<" + c);
            } else {
                System.out.print(b + "<" + c + "<" + a);
            }
        } else {
            if (a <= b) {
                System.out.print(c + "<" + a + "<" + b);
            } else {
                System.out.print(c + "<" + b + "<" + a);

            }
        }
    }
}

