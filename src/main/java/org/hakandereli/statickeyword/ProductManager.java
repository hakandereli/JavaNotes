package org.hakandereli.statickeyword;

public class ProductManager {

    //Static tanımlanmaz ise her ekleme işleminde bir productValidator den nesne üretmek zorunda kalmassın direk classs üzerinden kullanabilirsin.
//    public void add(Product product){
//
//        ProductValidotor productValidotor = new ProductValidotor();
//
//        if (productValidotor.isValid(product)) {
//            System.out.println("Eklendi.");
//        }else{
//            System.out.println("Ürün bilgileri geçersizdir.");
//        }
//
//    }

    public void add(Product product) {

        if (ProductValidotor.isValid(product)) {
            System.out.println("Ürün Bilgileri Doğru");
        } else {
            System.out.println("Ürün bilgileri geçersizdir.");
        }

    }

}
