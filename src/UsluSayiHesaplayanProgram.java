import java.util.Scanner;

public class UsluSayiHesaplayanProgram {
    public static void main(String[] args) {
        int n, k;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz.: ");
        n = input.nextInt();
        System.out.print("Üs sayıyı giriniz.: ");
        k = input.nextInt();
        int result = 1;
        for (int i = 1; i <= k; i++) {
            result *= n;
        }
        System.out.print(n + "^" + k + " = " + result);
    }
}

