package org.hakandereli.problemsolving.camelbananapuzzle;

import java.lang.reflect.Array;

public class GFG {

//    About
//    Mantık sorularından birisi olan deve kaç adet elma, muz , armut taşır gibisinden sorulan sorular için algoritmanın
//    türkçe yorumlanmış halidir. Parametreler değiştirilebilirdir.

//    https://www.geeksforgeeks.org/camel-and-banana-puzzle-dp/?ref=gcse

    //A , B ve C olarak 3 parametremiz var.

    //A Devenin gitmesi gereken toplam yol.
    //B Başlangıçta elimizdeki toplam elma
    //C ise devemizin toplam taşıma kapasitesi

    // dp adında 2 boyutlu bir matris oluşturuyorum bu matris A ve B parametreleri sınırlarını belirliyor.
    // A parametresi satır ve B parametresi sütünü belirler ancak diziler indis ile çalışır 0 dan dolmaya başlar.
    // ve dizi oluşturmak için +1 ile sınırlar verilir. Bu sebeple A+1 ve B+1 kullanıyoruz.
//    final static int dp[][] = new int[11][31];
    static int rows;
    static int cols;
    static int[][] dp;

    //Program, hesaplama sonuçlarını depolamak için bir dizi kullanır ve hesaplama sonuçlarına erişmek için
    // bu diziyi kullanarak sonuçları önbelleğe alır.
    // Bu önbellekleme işlemi, aynı hesaplamaların tekrarlanmasını önleyerek programın daha hızlı çalışmasını sağlar.
    //Bu işlemi yapabilmek için bu rekursif fonksiyonu kullanıyoruz.
    static int recAppleCnt(int A, int B, int C) {

        //Toplam yolumuz toplam elma sayımızdan fazla ise 0 elma taşırız.
        if (B <= A) {
            return 0;
        }

        //Devemiz elimizdeki toplam elmadan fazlasını taşıyabiliyorsa tek seferde hepsini yükler.
        //Gitmesi gereken yolu km başına 1 elma yiyerek gittiği için toplam elma - toplam yol yaparak bulabiliriz.
        //B <= A durumunu yukarıda kontrol etmiştik negatif değer dönmez 0 döner o senaryo için.
        if (B <= C) {
            return B - A;
        }

        //Gitmesi gereken yol 0 ise başlangıçtaki elmayı dön.
        if (A == 0) {
            return B;
        }

        //[Gitmemiz Gereken Yol][Toplam Elma sayımız] -1 değilse initlize değeri değildir zaten hesaplanmıştır bu değer bunu geri dönebilirsin.
        //Buradan aşağıda yazılan kodları çalıştırma böylece zamandan ve hafızadan tasarruf et.(bir nevi cache mantığı)
        if (dp[A][B] != -1) {
            return dp[A][B];
        }

        //Maksimum elma sayımızı Integer tipindeki en düşük değer olan -2147483648 veriyoruz 1 daha azaltırsak taşma yaşarız ve MAX_VALUE olan +2147483647 ulaşırız.
        //Bunu rekursif fonksiyona her girdiğinde yapıyoruz
        int maxCount = Integer.MIN_VALUE;

        //tripCount yapılacak sefer sayısıdır.
        //Başlangıtaki elma sayısının kapasiteye bölümünden kalan sıfır ise (elma sayımızın iki katının kapasiteye bölümünden) 1 çıkartırız.
        //Eğer kalan sıfır değilse tam kapasiteli taşıma yaparız 1 tur daha yapmamız lazım +1 ekleriz.
        int tripCount = B % C == 0 ? ((2 * B) / C) - 1 : ((2 * B) / C) + 1;

        //Rekursif olarak çağrıldığında A yani yol sürekli azalıyor
        //B de azalıyor
        for (int i = 1; i <= A; i++) {

            // Recursive fonksiyon kendini çağırıyor
            // Kalan yol
            int curCount = recAppleCnt(A - i, B - tripCount * i, C);

            // Kalan yol max dan büyükse max a eşitle
            if (curCount > maxCount) {
                maxCount = curCount;

                // veriyi cache e koy
                dp[A][B] = maxCount;
            }
        }

        // cevabı dön
        return maxCount;
    }

    //Static olarak tanımladığımız matrisin elemanlarını -1 ile initilizae ediyoruz içeride recursive fonksiyonumuzda karşılaştırma yapacağız.
    static int maxAppleCnt(int A, int B, int C) {
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                dp[i][j] = -1;

        return recAppleCnt(A, B, C);
    }

    public static void main(String[] args) {

        //Parametreleri alacağımız yer başlangıç kısmımız
        int A = 1000;
        rows = (A + 1);

        int B = 3000;
        cols = (B + 1);

        //Reflection ile dinamik 2d dizi oluşturuluyor.
        dp = (int[][]) Array.newInstance(int.class, rows, cols);

        int C = 1000;

        System.out.println(maxAppleCnt(A, B, C));
    }
}
