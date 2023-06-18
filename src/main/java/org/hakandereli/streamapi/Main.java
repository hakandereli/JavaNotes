package org.hakandereli.streamapi;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> personList = getPeople();

        // ************************************************************** Imprative ***************************************
        //Only Females
//        List<Person> females = new ArrayList<>();
//        for (Person person : personList) {
//            if (person.getGender().equals(Gender.FEMALE)) {
//                females.add(person);
//            }
//        }
//        females.forEach(System.out::println);

        // ***************************************************************Declarative ******************************************
        //Filter
//        List<Person> females = personList.stream()
//                .filter(person -> person.getGender().equals(Gender.FEMALE))
//                .collect(Collectors.toList());
//
//        females.forEach(System.out::println);

        //Sort
//        List<Person> sorted = personList.stream()
//                .sorted(Comparator.comparing(Person::getAge).reversed())
//                .collect(Collectors.toList());
//
//        sorted.forEach(System.out::println);

        //All Match - Hepsi 27 yaşından büyük mü?
//        boolean allMatch = personList.stream()
//                .allMatch(person -> person.getAge() > 27);
//
//        System.out.println(allMatch);

        //AnyMatch -- 30 Yaşından büyük var mı ?
//        boolean anyMatch = personList.stream()
//                .anyMatch(person -> person.getAge() > 30);
//
//        System.out.println(anyMatch);

        //NoneMatch -- Adı hakan dereli olan kayıt yok diyorsun varsa false döner yoksa true ?
//        boolean noneMatch = personList.stream()
//                .noneMatch(person -> person.getName().equals("Hakan Dereli"));
//
//        System.out.println(noneMatch);

//        İsminin sonu aş ile bitenlerin sayısı
//        long count = personList.stream()
//                .filter(person -> person.getName().endsWith("aş"))
//                .count();
//
//        System.out.println(count);

        //Max
//        personList.stream()
//                .max(Comparator.comparing(Person::getAge))
//                .ifPresent(System.out::println);

        //Min
//        personList.stream()
//                .min(Comparator.comparing(Person::getAge))
//                .ifPresent(System.out::println);


        //Group
//        Map<Gender, List<Person>> groupByGender = personList.stream()
//                .collect(Collectors.groupingBy(Person::getGender));
//
//        groupByGender.forEach((gender, personList1) -> {
//            System.out.println(gender);
//            personList1.forEach(System.out::println);
//        });

        //En yaşlı Erkeğin
//        Optional<String> oldestMaleName = personList.stream()
//                .filter(person -> person.getGender().equals(Gender.MALE))
//                .max(Comparator.comparing(Person::getAge))
//                .map(Person::getName);
//
//        oldestMaleName.ifPresent(System.out::println);


        //Tekrarlayan elemanları alma distinct 16 2 tane değil bir tane gelir.
//        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
//        List<Integer> distinct = numbers.stream()
//                .map( i -> i*i)
//                .distinct()
//                .collect(Collectors.toList());
//
//        distinct.forEach(System.out::println);


        //Aşağıdaki fonksiyonlar toplama işlemi yapmaktadır.
//        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
//        Integer sum = integers.stream()
//                .reduce(0, (a, b) -> a + b);
//        System.out.println(sum);
//
//        List<Integer> integers2 = Arrays.asList(1, 2, 3, 4, 5);
//        Integer sum2 = integers.stream()
//                .reduce(0, Integer::sum);
//        System.out.println(sum2);
//
//
//        List<Integer> integers3 = Arrays.asList(1, 2, 3, 4, 5);
//        Integer sum3 = integers.stream()
//                .collect(Collectors.summingInt(Integer::intValue));
//        System.out.println(sum3);



    }


    private static List<Person> getPeople() {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Hakan Dereli", 26, Gender.MALE));
        personList.add(new Person("Osman Ulusan", 27, Gender.MALE));
        personList.add(new Person("Veli Uzun", 40, Gender.MALE));
        personList.add(new Person("Raziye Türk", 60, Gender.FEMALE));
        personList.add(new Person("Sevilay Bozkurt", 8, Gender.FEMALE));
        personList.add(new Person("Ayşe Erli", 8, Gender.FEMALE));
        personList.add(new Person("Gizem Celik", 18, Gender.FEMALE));
        personList.add(new Person("Celal Çağdaş", 100, Gender.MALE));
        personList.add(new Person("Zahide Çağdaş", 80, Gender.FEMALE));


        return personList;
    }
}
