package org.hakandereli.statickeyword;

public class ProductValidotor {

    public ProductValidotor() {
        System.out.println("Yapıcı blok çalıştı");
        //New kelimesi kullanmadığı için constructor daki bu çıktıyı basmaz
        //Constructor lar new leyince çalışır.
        //c#da ise bu ayrım yoktur new lenmese de çalışır.
        //bunu java da sağlamak için static constructor kullanılır.
    }


    //static constructor 1
    static {
        System.out.println("Statik Yapıcı blok 1 çalıştı");
    }

    //static constructor 1
    static {
        System.out.println("Statik Yapıcı blok 2 çalıştı");
    }


    //static yazdığında buraya bunu new lemek zorunda değilsin ve manager da eklenen her ürün için hafıza da yeni bir alan ayırtmıyorsun. Hafıza da zaten var olan bir yeri kullanıyorsun.

    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

//    public boolean isValid(Product product){
//
//        if (product.price > 0 && !product.name.isEmpty()) {
//            return true;
//        }else {
//            return false;
//        }
//
//    }

    //c# da ana class yani bu örnek için productvalidotor classını static yapabilirsiniz ancak bu java da yoktur inner class ile sağlanır bu
    //inner classlar çok kullanılmaz piyasada
    //inner static class
    public static class NewClass {
        public static String NewFunction() {
            return "New Function çalıştı.";
        }
    }

}
