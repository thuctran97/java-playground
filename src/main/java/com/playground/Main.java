package com.playground;

import java.awt.*;
import java.util.Collection;
import java.util.LinkedHashSet;

public class Main {
    void addToRawList(List list){
        list.add("abc");
    }
    public static void main(String[] args) {
        Collection<String> collection;
        collection = new LinkedHashSet<>();
        collection.add("foo");
        collection.add("bar");
        collection.add("baz");
        collection.forEach(System.out::println);
    }
}
