/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hakandereli.generics.example4;

import java.util.HashSet;
import java.util.Set;

public class Main {

    //Bu örnekte elimizde iki liste olduğunu düşünelim ve bu ikisini tekrarsız olacak şekilde tek bir listede birleştirelim ancak bu veriler string, sayı vs olabilsin.
    //Genericler ile ne kadar kolay olduğunu görelim.
    public static void main(String[] args) {

        //*************************************************************String Tipinde
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Hakan");
        stringSet.add("Osman");
        stringSet.add("Sertan");

        Set<String> stringSet2 = new HashSet<>();
        stringSet2.add("Veli");
        stringSet2.add("Hakan");
        stringSet2.add("Sertan");

        Set<String> stringUnionSet = MyUnionFunction(stringSet, stringSet2);

        System.out.println(stringUnionSet);

        //****************************************************************Integer Tipinde
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(4);
        integerSet.add(5);

        Set<Integer> integerSet2 = new HashSet<>();
        integerSet2.add(1);
        integerSet2.add(3);
        integerSet2.add(5);
        integerSet2.add(7);

        Set<Integer> integerUnionSet = MyUnionFunction(integerSet, integerSet2);
        System.out.println(integerSet);

        //*****************************************************************Customer Tipinde
        Set<Customer> customerSet = new HashSet<>();
        customerSet.add(new Customer(1L, "Hakan", "Dereli"));
        customerSet.add(new Customer(2L, "Ali", "Veli"));
        customerSet.add(new Customer(3L, "Hasan", "Uzun"));

        Set<Customer> customerSet2 = new HashSet<>();
        customerSet2.add(new Customer(1L, "Hakan", "Dereli"));
        customerSet2.add(new Customer(5L, "Deniz", "Kaya"));

        Set<Customer> customerUnionSet = MyUnionFunction(customerSet, customerSet2);
        System.out.println(customerSet);
    }

    //Tip değiştikçe farklı farklı metodlar yazmak yerine tek bir methodda hepsini halletmiş olduk.
    //Generic Method tanımlamak için aşağıdaki yapı kullanılır.
    //ACCESS MODIFIER(public private ...) +
    //VARSA STATİC FİNAL VS. + 
    //<CONVENTIONS> bir den fazla olabilir bu method generic olacak demek istiyoruz.
    //Methodun Geri dönüş tipi +
    //methoda ne isim verileceği +
    //(Parametreler)
    // !!!! Generic ifadeye verilen isim T olduğu için hepsinde T kullanılmış buna dikkat et.
    // !!!! Convention da verilen harfler ile aynı olmalı parametlerde verilen hafler aşağıdaki gibi yaparsan hata alırsın.
//    public static <T> Set<T> MyUnionFunctionHatali(Set<K> set1, Set<B> set2){
//        
//        Set<T> result = new HashSet<>(set1);
//        result.addAll(set2);
//
//        return result;
//    }
    public static <T> Set<T> MyUnionFunction(Set<T> set1, Set<T> set2) {

        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);

        return result;
    }
}
