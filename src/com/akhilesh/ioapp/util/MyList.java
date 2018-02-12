/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.ioapp.util;

import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author Akhilesh
 */
public class MyList<T> implements Iterable<T> {

    private Object[] array = new Object[0];

    public void add(T t) {
        if (array.length == 0) {
            array = new Object[1];
            array[0] = t;
        } else {
            Object[] array1 = new Object[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                array1[i] = array[i];
            }
            array1[array.length] = t;
            array = array1;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return (Iterator<T>) Arrays.asList(array).iterator();
    }

}
