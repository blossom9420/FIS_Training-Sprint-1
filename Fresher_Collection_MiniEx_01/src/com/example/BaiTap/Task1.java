package com.example.BaiTap;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        Student s1 = new Student("Long", 9.0);
        Student s2 = new Student("Linh", 9.0);
        Student s3 = new Student("AAA", 4.0);
        Student s4 = new Student("HHH", 3.0);

        List<Student> list = Arrays.asList(s1, s2, s3, s4);

        //getStudentNameStartWithHCach2(list);
        //list = getLimitStudentByScoreMax(list);

        //sortStudentByScoreDESC(list);

        //Student s = getFirst(list);

        getStudentNameStartWithHandScoreThan5(list);
        //System.out.println(list);
    }

    static void getStudentNameStartWithHCach1(List<Student> list) {
        // lấy ra sv bát dau bang H
        // cach 1
        list.stream()
                .filter(sv -> sv.getName().startsWith("L"))
                .forEach(System.out::println);

        // cach 2
        list.stream()
                .filter(sv -> sv.getName().startsWith("L"))
                .forEach(sv -> System.out.println(sv));
    }

    static void getStudentNameStartWithHCach2(List<Student> list) {
        // Comparator<Student>comparator =  Comparator.comparing(t->t.getScore());
        // Comparator<Student>comparator =  Comparator.comparing(Student::getScore, ((o1, o2) -> o1.compareTo(o2)));
        // Comparator<Student>comparator =  Comparator.comparing(Student::getScore, ((o1, o2) -> (int) (o1-o2))); // giảm dần
        // Comparator<Student>comparator =  Comparator.comparing(Student::getScore, ((o1, o2) -> (int) (o2-o1))); // tăng dần
        Comparator<Student> comparator = Comparator.comparing(Student::getScore, new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return (o1 > o2) ? 1 : ((o1 < 02) ? -1 : 0);
            }
        });
        list.stream().sorted(comparator).forEach(System.out::println);
    }

    static void sortStudentByScoreDESC(List<Student> list) {
        // sap xep theo so diem giam dan
//        list.stream()
//                .sorted((o1, o2) -> o1.getScore().compareTo(o2.getScore()))
//                .collect(Collectors.toList());


        // anonymous function
        list.stream()
                .sorted((o1, o2) -> {
                    return o1.getScore().compareTo(o2.getScore());
                })
                .collect(Collectors.toList());

//        list.stream()
//                .sorted((o1, o2)final -)
//                .collect(Collectors.toList());
    }

    static List<Student> getLimitStudentByScoreMax(List<Student> list) {
        // sap xep theo so diem giam dan
        return list.stream()
                .sorted((o1, o2) -> o1.getScore().compareTo(o2.getScore()))
                .limit(3)
                .collect(Collectors.toList());
    }

    static Student getFirst(List<Student> list) {
        // sap xep theo so diem giam dan
        Optional<Student> op = list.stream()
                .sorted((o1, o2) -> o1.getScore().compareTo(o2.getScore()))
                .findFirst();

//        if( op.isPresent()){
//            return  op.get();
//        }
//        return null;
        return op.orElse(null);
    }

    static void getStudentNameStartWithHandScoreThan5(List<Student> list) {
        // lấy ra sinh vien bat dau bang chu L va co diem lon hon 5
        list.stream()
                .filter(sv -> {
                    return sv.getName().startsWith("L") && sv.getScore() > 5;
                })
                .forEach(System.out::println);
    }

}

class compareStudentByScore {

}