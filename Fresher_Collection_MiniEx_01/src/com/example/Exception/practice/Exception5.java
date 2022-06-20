package com.example.Exception.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exception5 {
    static List<Integer> integers  = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 6, 7, 6);
    static List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

    @Test
    void  testRemoveForIndex(){
        for (int i = 0; i < integers.size(); i++) {
            if(integers.get(i)>=6){}
//                integers.remove(integers.get(i));
        }
        System.out.println(integers);
        Assertions.assertEquals(expected.toArray(),integers.toArray());
    }

    @Test
    void  testRemoveIf(){
        integers.removeIf(i -> i>=6);
        Assertions.assertArrayEquals(expected.toArray(), integers.toArray());
    }

}
