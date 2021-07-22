package com.Collection.CollentionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo_3 {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<String>();

        c.add("hello");
        c.add("world");
        c.add("java");
        Iterator<String> it = c.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }

    }
}
