package org.hakandereli.variablearguments;

public class VariableArguments {

    //... 3 nokta kullanarak yapabilirsin.
    //Sadece int olarak düşünme Nesne olabilir liste olabilir sonuna ... koyman yeterli
    //Aynı işlemi tabi liste kullanarakta yapabilirsin.
    //Piyasada çok kullanılmaz listelerle yani Collections yapıları ile yapmak daha mantıklı çünkü test edilebilirliği azalıyor.
    //Örneğin bir nesne yolladın içindeki tipler uyumlu olacak mı yapılacak işlemler azalır güvenirliği
    public static int topla(int... sayilar) {

        int toplam = 0;

        for (int sayi : sayilar) {
            toplam += sayi;
        }

        return toplam;
    }

    public static void main(String[] args) {

        System.out.println(topla(1, 3, 2, 56, 74));
    }
}
