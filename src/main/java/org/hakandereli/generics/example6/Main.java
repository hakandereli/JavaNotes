/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hakandereli.generics.example6;

import java.util.HashSet;
import java.util.Set;

public class Main {
    
    //Şöyle bir soru var;
    //Integer 1,2,3,4,5 gibi sayılar var.
    //birde Double 1.0, 2.2 , 3.5 , 12.2 gibi ondalıklı sayılar var bunlar birer liste biz bu iki listeyi birleştirelim
    
    public static void main(String[] args) {
        
        //Integer Set
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(4);
        
        //Double Set
        Set<Double> doubleSet = new HashSet<>();
        doubleSet.add(1.0);
        doubleSet.add(2.5);
        doubleSet.add(3.25);
        
        Set<Number> numberUnionSet = union(integerSet, doubleSet);

        System.out.println(numberUnionSet);
    }
    
    
    public static <T> Set<T> union(Set<? extends T> integerSet, Set<? extends T> doubleSet){
        Set<T> result = new HashSet<>(integerSet);
        result.addAll(doubleSet);
        return result;
    }
}
