/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hakandereli.generics.example1;

import java.util.ArrayList;
import java.util.List;

public class WhyUseGenerics {
    
    public static void main(String[] args) {
        
            /*
        Generikleri Neden Kullanmalıyız ? 

        Derlenme zamanında oluşan hataları(Compile Error) maliyeti düşük ve tespit etmesi düzeltmesi kolaydır.(Compile time da tip güvenliği sağlar.)
        
        Autoboxing unboxing gibi cast işlemlerinin önüne geçmenizi sağlar yandaki gibi kullanımı azaltır. // String name = (String) list.get(0);
        
        Esnekliği sağlar ve kod tekrarını azaltır.

        Ancak Çalışma zamanında (Run-time Error) sırasında oluşan hatalar çok çeşitli olabilir
        ve proje hayata geçtikten belkide seneler sonra ortaya çıkarak büyük sıkıntılar yaratabilir.

        Generics yapılar Tip bağımlılığını azaltılmasını ve böylece run-time hatalarının derleme hatalarına dönüştürülmesini sağlar.
        Böylece projenin kararlılığını artıtır bakım maliyetleri azaltır.


        */
        List myList = new ArrayList();
        myList.add("TEST");
        String myString = (String) myList.get(0);
        System.out.println(myString);
        
        /*

        String myString = myList.get(0);

        Bu Şekilde Alamassın Cast Etmene zorlar.
        
        ve cast hatası alabilirsin içerisine adam string de yollar integer da yollar her şeyi yollar.
        
        Ama eğer tanımlarsan cast işlemini engellemiş olursun.
        */
        
        List<String> myGenericList = new ArrayList<>();
        myGenericList.add("TEST2");
        String myString2 = myGenericList.get(0);
        System.out.println(myString2);
        }
}
