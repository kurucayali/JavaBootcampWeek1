import java.util.Scanner;
public class DaireDilimininAlaniniBulma {
    public static void main(String[] args) {
        // değişkenleri tanımla. palan = parçanın alanı. a=açı
        int r,a;
        double pi=3.14, palan, alan;
        // inputları al
        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçap giriniz..:" );
        r= input.nextInt();
        System.out.print("Açı giriniz..:");
        a= input.nextInt();

        // formulleri yaz
            alan = pi * r * r;
            palan= pi * r * r * a /360 ;

            //çıktıları ver
            System.out.println("Açı diliminin alanı ..:"+palan);
            System.out.println("Tüm diarenin Alanı..:"+ alan);

    }
}
