import java.util.Scanner;

public class BurcBulmaProgrami {
    public static void main(String[] args) {

        int month, day;

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan ay ve gün bilgisini alalım
        System.out.print("Doğduğunuz ayı girin (1-12): ");
        month = input.nextInt();
        System.out.print("Doğduğunuz günü girin: ");
        day = input.nextInt();

        // Burç bulma işlemi
        String burc = "" ;

        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            burc = "Koç";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            burc = "Boğa";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            burc = "İkizler";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            burc = "Yengeç";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            burc = "Aslan";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            burc = "Başak";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            burc = "Terazi";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            burc = "Akrep";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            burc = "Yay";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            burc = "Oğlak";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            burc = "Kova";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            burc = "Balık";
        } else {
            burc = "Geçersiz tarih!";
        }

        // Burcu ekrana yazdır
        System.out.println("Merhaba, Burcunuz: " + burc);
    }
}
