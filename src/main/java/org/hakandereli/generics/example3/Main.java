/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hakandereli.generics.example3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Örnek 1
        //Raw type ham tür demektir.
        //Object gibi raw type leri kullanılırken dikkatli olman lazım yada List e kullanırken hangi türde olduğunu bildirmen gerekiyor.
        List<String> plakalar = new ArrayList<>();
//        unsafeAdd(plakalar, Integer.valueOf(42));  
        safeAdd(plakalar, Integer.valueOf(28));
        String plaka = plakalar.get(0);
        System.out.println("----------------------- Örnek 1 -----------------------");
        System.out.println(plaka);

        //Örnek 2
//        List isimListesi = new ArrayList<>();
//        isimListesi.add("Hakan");
//        isimListesi.add("Ali");
//        isimListesi.add("Sertan");
//        isimListesi.add(Boolean.FALSE);
//        isimListesi.add(BigInteger.ZERO);
//        isimListesi.add(Double.valueOf(12.25));
        //Bu kod yazarken yada derlerken hata vermez run time da hata verdiği için bu şekilde kullanılmamalıdır.
//        String isim = (String) isimListesi.get(3);

        //Listeyi string tipinde tanımlarsan eğer kodu daha yazarken hata verir hata yapmanı önler.
        List<String> isimListesi2 = new ArrayList<>();
        isimListesi2.add("Hakan");
        //isimListesi2.add(Boolean.FALSE); // Bu satır hata verir daha derlenmeden.
        isimListesi2.add("Hasan");
        
        
        System.out.println("----------------------- Örnek 2 -----------------------");
        String isim = isimListesi2.get(0);
        System.out.println(isim);


    }

    private static void unsafeAdd(List list, Object o) {
        //Bu neden güvensiz bir ekleme Listeye tip verilmemiş ve gelen veri object olarak alınmış ve eklenmiş.
        //Bu kod yazarken yada derlerken hata vermez run time da hata verdiği için bu şekilde kullanılmamalıdır.
        list.add(o);
    }

    private static void safeAdd(List<String> list, Integer i) {
        list.add(String.valueOf(i));
    }
}
