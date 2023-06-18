/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hakandereli.generics.example2;

/*
    Box class ını generic yapabilmek için T türünden parametre geçilmeli ve içerisinde T türünden bir nesne olmalıdır.

    İsimlendirme olarak tek karakter ve büyük olmalıdır bu bir kuraldır diğer tanımlardan(class, intarface gibi) ayırmak için vardır bu kurallar.


    En sık kullanılan parametre isimleri T dahil aşağıdaki şekildedir.

    E - Element (used extensively by the Java Collections Framework)
    K - Key
    N - Number
    T - Type
    V - Value
    S,U,V etc. - 2nd, 3rd, 4th types

    Bu türler int, float, string gibi primitive tipler olamaz bu şekilde parametre geçilemez.
*/

public class GenericBox<T> {

    private T genericObje;
    
    public GenericBox() {
    }

    public T getGenericObje() {
        return genericObje;
    }

    public void setGenericObje(T genericObje) {
        this.genericObje = genericObje;
    }
    
    
}
