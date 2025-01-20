package com.soda.java.learn.generic;

public class GenericsType <T>{
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        GenericsType<String> obj = new GenericsType<String>();
        obj.setValue("Hello");
        System.out.println(obj.getValue());
    }
}
