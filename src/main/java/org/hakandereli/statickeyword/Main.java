package org.hakandereli.statickeyword;

public class Main {

    /*
     * Staticler proje ayağa kalkarken ram de tutulmaya başlanır ve proje sonlandırılana kadar ram de kalır.
     * Static tanımlanan ifade hafıza da aynı yere işaret edeceği için değeri değiştirilirse kullanılan her yerde değeri değişir.
     * Static methodlar static değer dönmelidir.
     * Staticleri mesala şu şekilde kullanabiliriz ekran uyarı mesajları verdirilecek ise ve bu mesajlar hep benzer mesajlar ise örneğin:
     * Kayıt eklendi, silindi gibisinden static bir class tanımlayıp buradan çekmek her seferinde hem yazmadan kurtarır bizi hem de yeni bir string i hafızaya almaktan.
     *
     * */


    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        Product product = new Product(1, "mouse", 1);
        Product product2 = new Product(2, "keyboard", 2);


        productManager.add(product);

        //Ekleme işlemi başarılı
        System.out.println(Message.eklendi);

        //1 ürün ekledik ama 2 ürün oluşturduk
        System.out.println(Product.count + " adet ürün oluşturuldu");
    }
}
