package org.hakandereli.mutability;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

//        Mutable ve Immutable Nedir?
//        1-Mutable bir objeyi oluşturduğumuz da bu objenin durumunu state ini değiştirebilmeye denir.
//        2-Immutable ise değiştirememeye denir.

        String isim = "HAKAN";
        isim.toLowerCase();
        System.out.println(isim.toLowerCase());//Bu satırda hepsini küçük yapar
        System.out.println(isim);//Bu satırda hepsini küçük yazmaz başlangıçta neyse onu basar
        System.out.println("------------------------------------------------------------------");

//        Bu şu demek aslında isim.toLowerCase() methodu ile biz direk olarak new ledeiğimiz objeyi değiştiremiyoruz.
//        String o zaman immutable yani değiştirilemez bir obje olarak tanımlanmış java tarafından.

//        Immutable tanımlı sınıflardan üretilen objelerde
//        her seferinde yeni klonunu,kopyasını verir java biz onda işlem yaparız.
//        ***Değişmez bir nesneyi değiştirmek isterseniz, onu klonlamanız ve oluştururken klonu değiştirmeniz gerekir.***
//        isim.toLowerCase() methodu aslında objeyi klonlar ve hafıza da yeni bir alan açar.
//
//        isim.toLowerCase() methodunu bir değişkene atayıp daha sonra
//        bu objenin değerini isime verirsek anca isimi değiştirebiliriz.

//        Ama eğer new lediğimiz obje Mutable değiştirilebilir bir obje ise biz kopyasında değil orjinal objede işlem yaparız.

//        Java’da yaygın olanlarından örnek verecek olursak
//        String ve tüm ilkel sarmalayıcılar -Wrapper sınıflar (Integer, Long, Double, Byte….), BigDecimal, BigInteger immutable sınıflardır.
//        Date, StringBuilder mutable sınıflardandır.

//        Date sınıfını hepimiz aktif olarak kullandık ve mutable olmasından dolayı sıkıntılar yaşamışızdır.
//        Bu sebeple Java 8 ile beraber immutable olan LocalDate sınıfı gelmiştir. Aşağıdaki örneği inceleyiniz.

        Date date = new Date();
        System.out.println(date);

        date.setDate(15);
        System.out.println(date);

        System.out.println("------------------------------------------------------------------");

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        localDate.plusDays(5);
        System.out.println(localDate);

        System.out.println("------------------------------------------------------------------");


//        Java’da değişmez sınıf yapmak için aşağıdaki adımları uygulamanız gerekir.
//
//        Sınıfı, final anahtarı ile işaretlemek gerekir, böylece genişletilemez (extend edilemez).
//        Sınıfın tüm alanlarını private yapın, böylece doğrudan erişime izin verilmez.
//        Değişkenler için setter yöntemleri sağlamayın.
//        Tüm değiştirilebilen alanları final yapın, böylece yalnızca bir kez atanabilir.
//        Tüm alanların, contructor aracılığıyla ilk değerlerini atamasını sağla.
//        Değiştirebilir olan tüm alanların dışarıya nesnelerin klonlanarak dönmesini gerçekleştirin.
//
//        public final class ImmutablePerson {
//
//            private final String name;
//
//            public ImmutablePerson(String name) {
//                this.name = name;
//            }
//
//            public String getName() {
//                return name;
//            }
//        }

        //Immutable objelerin dez avatanjı bir objenin değerini değiştirmek istediğiniz de sürekli olarak atama
        //işlemini kullanmanız yani sürekli klonlama ve hafızada yeni yer ayırma yapmanız gerekiyor.

//        Immutable nesneler, çok iş parçacıklı(multi-threaded) ortamlarda ve streamlerde kullanışlıdır.
//        Değişmeyen nesnelere güvenmek harikadır.
//        Başka bir thread’in nesnesini değiştiren bir iş parçacığının neden olduğu hatalar olabilir.
//        Immutable nesneler, bu sorunların tümünü çözmüş olacaktır.

    }
}