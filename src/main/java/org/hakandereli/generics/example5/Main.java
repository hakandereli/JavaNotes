/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hakandereli.generics.example5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
         //PECS
    
    // Producer extends - Üreteceğin zaman extends 
    // Consumer super - Tüketeceğin Zaman super kullanılır
    
//    List<Object> objeList = new ArrayList<String>();
    //Object String in üst sınıfı ama neden oluşturamadın hata verdi;
    //çünkü genericlerde alt tip ve üst tip bağlantısı yoktur. extends ve super ifadeleri ile sağlanır bu işlem.
    
    List<Object> objeList = new ArrayList<>();
    
    
    //A yı extends eden tipte bir veri gelicek şeklinde tanımlıyoruz extends ifadesi ile eşitliğin sağında B tipinden bir veri gelmiş.
    List<? extends A> list = new ArrayList<A>();
    List<? extends A> list2 = new ArrayList<B>();
    List<? extends A> list3 = new ArrayList<C>();
    List<? extends A> list4 = new ArrayList<D>();
    
    
    //B ve B nin üst türlerinden tip gelebilir.
    List<? super B> list5 = new ArrayList<A>();
    List<? super B> list6 = new ArrayList<B>();
//    List<? super B> list7 = new ArrayList<C>();
//    List<? super B> list8 = new ArrayList<D>();
    //C ve D olmaz çünkü bunlar b veya üstü değil.
    }
}
