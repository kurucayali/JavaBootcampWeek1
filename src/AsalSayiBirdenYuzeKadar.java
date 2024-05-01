public class AsalSayiBirdenYuzeKadar {
    public static void main(String[] args) {
        // 1'den 100'e kadar olan sayıları kontrol ediyoruz
        for (int i = 2; i <= 100; i++) {
             // Her sayıyı varsayılan olarak asal olarak kabul ediyoruz
            boolean isPrime = true;
            // 2'den sayının kendisine kadar olan tüm sayılarla bölenlerine bakıyoruz
            for (int j = 2; j < i; j++) {
                // Eğer herhangi bir sayıya tam bölünürse bu sayı asal değildir
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            // Eğer sayı asal ise ekrana yazdırıyoruz
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
