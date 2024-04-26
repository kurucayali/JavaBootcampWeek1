
/*
Kullanıcı giriş ekranınındaki username ve password bilgilerini kontrol edeceğiz.
Eğer hatalıysa değiştirmesine olanak sağlayacağız.
*/
import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password , newPassword;
        int select;

        // Girdileri alalım
        Scanner input= new Scanner(System.in);
        System.out.print("Kullanıcı Adınız : ");
        userName= input.nextLine();
        System.out.print("Şifreniz : ");
        password = input.nextLine();

        /* Girdilerin doğruluğunu kontrol edelim ve senaryoyu oluşturalım.
        Eğer bilgilerin ikiside doğruysa giriş yapsın. Eğer ikiside yanlışsa bilgiler hatalı uyarısı alsın.
        Eğer kullanıcı adı doğru şifre hatalı ise yeni şifre oluşturmasına izin versin.*/

        if(userName.equals("patika") && password.equals("java123")){
            System.out.print("Giriş Yaptınız! ");

            //Kullanıcı adı doğru şifre hatalı.
        } else if (userName.equals("patika") && !password.equals("java123")){
            System.out.print("Şifreniz Hatalı!\nDeğiştirmek istermisiniz ?\n1-Evet\n2-Hayır\n");
            System.out.print("Seçiminiz :" );
            select = input.nextInt();

                if(select==1){       //yeni şifre oluşturmak isterse
                    Scanner input2=new Scanner(System.in);
                    System.out.print("Yeni şifre giriniz : ");
                    newPassword = input2.nextLine();
                    //Yeni şifre eskisine eşit mi ?
                     if(newPassword.equals("java123")){
                         System.out.print("Yeni şifreniz eskisi ile aynı olamaz !");}
                     else {
                         newPassword = password;
                         System.out.println("Yeni şifreniz oluşturuldu");}

                }else {         // Yeni şifre oluşturmak istemezse
                    System.out.print("Şifreniz hatalı, tekrar deneyiniz"); }


        }
        else {
            System.out.print("Bilgileriniz Yanlış!  ");}
    }
}
