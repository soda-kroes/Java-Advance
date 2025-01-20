package com.soda.java.learn.lambda.method.reference;

public class MyFinder implements Finder {
    @Override
    public int find(String source, String textToFind) {
        return source.indexOf(textToFind);
    }
}
