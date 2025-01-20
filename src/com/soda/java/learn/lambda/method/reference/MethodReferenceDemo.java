package com.soda.java.learn.lambda.method.reference;


public class MethodReferenceDemo {
    public static void main(String[] args) {

        Finder finder = new MyFinder();
        String text = "Welcome to Cambodia";

        int index = finder.find(text, "to");
        System.out.println(index);

        Finder finder2 = FindText::getIndexFromString; //Method reference
        int indexFound = finder2.find("Dara is a student", "is");
        System.out.println(indexFound);

        Finder finder3 = (text1, text2) -> text1.indexOf(text2) + 20;
        System.out.println(finder3.find("abcd", "b"));

        /*
        MyPrinter myPrinter = s -> System.out.println(s);
        myPrinter.print("Test method");

        MyPrinter myPrinter1 = System.out::println;
        myPrinter1.print("Hello Dara");
         */

        //parameter method reference




    }

}
