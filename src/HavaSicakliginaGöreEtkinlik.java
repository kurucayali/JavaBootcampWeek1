/*
Hava sıcaklığına göre etkinlik önerme programı
Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
 */
import java.util.Scanner;
public class HavaSicakliginaGöreEtkinlik {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Hava Sıcaklığını Giriniz..: ");
        heat = input.nextInt();

        if(heat<=5){
            System.out.print("Kayak yapabilirsin.");
        }else if (heat > 5 && heat<=15){
            System.out.print("Sinemaya gidebilirsin.");
        } else if( heat>15 && heat <=25){
            System.out.print("Piknik yapabilirsin");
        }else {
            System.out.print("Yüzemeye gidebilirsin");
        }
    }
}
