package org.hakandereli.multithreading;


import org.hakandereli.multithreading.model.Account;
import org.hakandereli.multithreading.worker.AccountHolder;

public class Main {
    public static void main(String[] args) {

        //Java threadleri yönetmek için JVM i kullanır jvm işletim sistemi gibi kaynak dağıtımlarını yönetir.
        //Thread ler yarış halinde run methodlarını tüketmeye çalışır.
        //Her thread in kendi stack alanı mevcuttur.
        //Tek obje üzerinde işlem yapıldığında her thread kendi stack alanın da primitive tipleri tutar.
        //Referans tiplerde ise değer okuma yazma için heap ortak olan heap alanına giderler.
        // balance = balance - amount; bu işlem tek cycle da gerçekleşmez
            // 1 balance değerini oku
            // 2 amount değerini oku
            // 3 amount balance - amount
            // 4 balance a yeni değeri ata
        // İki threadli bir uygulamada bu 4 aşama da bir threadin kesinlikle hepsini bitirecek diye bir iş söç konusu
        // değildir. Objenin kilidini almayı başaran işlemini yürütür.
        // Heap alanı olduğu için theadlerin kendi cache belleklerinde farklı değerler oluşabilir bu da
        // veri tutarsızlığına yol açar.
        // bu uygulama da olmayan bir paranın çekilmesi çok büyük bir problem aslında.
        // Ama hız için çok thread lazım diyelim.
        // synchorized anahtar kelimesi o metoda tek threadin girmesini sağlar.
        // bu anahtar sözcüğü kullanırken dikkat etmek gerekir yavaşlatır uygulamayı.
        // oluşturulan threadlerden hariç jvm main thread ile çalışır.
        // yazım sırası önemli değildir threadlerde işleticiyi yakalayan çalışır.
        // en aşığıdaki Test çıktısı hepsinden önce de çalışabilir ortada yazabilir en son da da yazabilir.

        Account account = new Account();
        AccountHolder accountHolder = new AccountHolder(account);

        Thread t1 = new Thread(accountHolder);
        Thread t2 = new Thread(accountHolder);
        t1.setName("Ali");
        t2.setName("Ayşe");

        t1.start();
        t2.start();


        System.out.println("Test");
    }
}