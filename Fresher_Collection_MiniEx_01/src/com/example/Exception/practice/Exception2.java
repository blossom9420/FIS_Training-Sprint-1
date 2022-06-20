package com.example.Exception.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exception2 {
    static List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

    public static void main(String[] args) {
        List<Integer> temp = new ArrayList<>();
        // basic
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) > 5) {
//                temp.add(list.get(i));
//            }
//        }

        // stream , TINH GIẢM HẾT MỨC
//        temp = list.stream()
//                .filter(item -> item > 5)  // lamda expression
//                .collect(Collectors.toList());


        // anonymous function
//        temp = list.stream()
//                .filter(item -> {  // nhiều hơn 1 thao tác thì phải dùng ngoặc
//                    System.out.println(item);
//                    return item > 5;
//                })
//                .collect(Collectors.toList());

        // filter (Predicate - interface )
        temp = list.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        return integer > 5;
                    }
                })
                .collect(Collectors.toList());

        System.out.println(temp);
    }
}
