package com.soda.java.learn.lambda.constructor.reference;

public class ConstructorReferenceDemo {
    public static void main(String[] args) {
//        Student st = new Student("Soda",18);
//        StudentService studentService = (name,age) -> new Student(name,age);
        StudentService studentService = Student::new;// constructor reference
        Student st1 = studentService.createStudent("Soda", 18);
        System.out.println(st1.getName());


    }
}
