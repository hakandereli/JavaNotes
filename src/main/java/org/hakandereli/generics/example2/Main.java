/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hakandereli.generics.example2;

public class Main {

    public static void main(String[] args) {

        /*
            Box diye bir class oluşturdun ve içerisine Object class türünden tanımlama ekledin getter setterini ekledin.
            bu sayfada box dan bir nesne üretiyorsun.
        
            Object tipinden verdiğin ve tüm classlar Object den türediği için adam her türden veri yükleyebilir içine
        
            bu dönen değeri bir toplama işleme sokmak istersen hata alırsın.
         */
        //Generic olmayan
        Box box = new Box();

        box.setMyObject("String Type Writing");
        System.out.println(box.getMyObject());

        //Hatalı Kullanım
        //BigDecimal.TEN.add((BigDecimal) box.getMyObject());
        System.out.println(box.getMyObject());

        //Generic
        //GenericBox<String> stringGenericBox = new GenericBox<String>();
        // Bu şekilde de çalışır ancak java 7 den sonra <> şeklinde yapman yeterli
        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.setGenericObje("Test");
        System.out.println(stringGenericBox.getGenericObje());



    }

}
