package com.soda.java.learn.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Dara",23,List.of("Eng","Math")),
                new Student("Thida",23,List.of("Chemistry","Math","Khmer")),
                new Student("Dara",23,List.of("Eng","Japan")),
                new Student("Sopheak",23,List.of("Phy","Math"))
        );

        //find all subjects
        /*
        List<List<String>> collect = students.stream()
                .map(st -> st.getSubjects())
                .collect(Collectors.toList());
         */

        List<String> collect = students.stream()
                .flatMap(stu -> stu.getSubjects().stream())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);



    }
}
