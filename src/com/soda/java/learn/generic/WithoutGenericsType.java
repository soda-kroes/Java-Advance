package com.soda.java.learn.generic;

public class WithoutGenericsType {
    private Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public static void main(String[] args) {
        WithoutGenericsType obj = new WithoutGenericsType();
        obj.setValue(1);

        String st = (String) obj.getValue();
        System.out.println(obj);
    }
}
