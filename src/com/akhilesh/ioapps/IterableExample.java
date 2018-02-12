/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.ioapps;

import com.akhilesh.ioapp.util.MyList;

/**
 *
 * @author Akhilesh
 */
public class IterableExample {

    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("hello");
        list.add("hi");
        list.add("namaste");

        for (String s : list) {
            System.out.println(s);
        }
        
    }
}
