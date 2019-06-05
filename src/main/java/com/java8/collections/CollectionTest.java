package main.java.com.java8.collections;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByKey;
import static java.util.Map.Entry.comparingByValue;

public class CollectionTest {
    public static void main(String[] args) {
        List<Integer> list = List.of(5,4,66,435,23,67,224,6543,65,77);
        iterateThroughConsumer(list);
        // is equivalent to
        list.forEach(i-> System.out.println(i));
        // is equivalent to
        list.forEach(System.out::println);


        Map<String,String> countryCapitalMap = new HashMap<>();
        countryCapitalMap.put("America", "Albana");
        countryCapitalMap.put("US", "Wshington DC");
        countryCapitalMap.put("England", "London");
        countryCapitalMap.put("France", "abcd");

        Map<String, String> sortedMap = sortMapUsingKey(countryCapitalMap);
        iterateThroughMap(sortedMap);






    }

    // iterate list
    public static void iterateThroughList(List<Integer> list){
        list.forEach(System.out::println);
    }

    // foreach internal impl
    public static void iterateThroughConsumer(List<Integer> list){
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        list.forEach(consumer);
    }

    // iterate map
    public static void iterateThroughMap(Map<String,String> map){
        map.forEach((key, value) -> System.out.println(key+" : "+value));
    }

    // iterate key value pair

    public static Map<String,String> sortMapUsingKey(Map<String,String> map){

       return map.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .collect(Collectors.toMap(e->e.getKey(),e->e.getValue()));


    }
}
