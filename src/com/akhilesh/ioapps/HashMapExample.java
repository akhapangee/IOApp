/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.ioapps;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Akhilesh
 */
public class HashMapExample {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Akhilesh Khapangee");
        hashMap.put(2, "Rameshwor Khanal");
        hashMap.put(2, "Test Name");

        for (HashMap.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
        if(hashMap.containsKey(1)){
            System.out.println(hashMap.get(1));
        }

    }
}
