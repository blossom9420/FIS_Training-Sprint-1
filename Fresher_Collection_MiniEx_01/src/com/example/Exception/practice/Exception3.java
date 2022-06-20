package com.example.Exception.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exception3 {

    // No anynomous
    static List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

    public static void main(String[] args) {
        List<Integer> temp = new ArrayList<>();

        // anonymous class
//        temp = list.stream()
//                .filter(new Predicate<Integer>() {
//                    @Override
//                    public boolean test(Integer integer) {
//                        return integer > 5;
//                    }
//                })
//                .collect(Collectors.toList());


        // anonymous custom class
        temp = list.stream()
                .filter(new PredicateCustom())
                .collect(Collectors.toList());
        System.out.println("1"+temp);
    }
}

class PredicateCustom implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        return integer > 5;
    }
}

