package com.soda.java.learn.streamApi;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo1 {
    static List<String> names = List.of("Dara", "Thida", "Davan", "Cheata", "Thida", "Seyha", "Dany"); //source

    public static void main(String[] args) {
        /*
        Stream<String> streamName = names.stream();// obtain stream instance
        streamName.filter(n -> n.contains("t"))
                .map(name -> name.length()) //intermediate operation , lazy
                .forEach(System.out::println); //terminal operation
         */

//        distinct();
//        collectDemo();
        List<Integer> collect = names.stream()
                .distinct()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    static void collectDemo(){
        Set<String> namesSet = names.stream().collect(Collectors.toSet());
        System.out.println(namesSet);
    }

    static void distinct() {
        names.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
