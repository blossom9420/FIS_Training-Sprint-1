package com.example;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExampleTest {
    private  final Predicate<String> predicateStr = s -> {
      return  s.startsWith(("b"));
    };
    private  final Consumer<String> consumerString = s -> {
        System.out.println(s);
    };
    @Test
    void testOfFunction(){
        Stream.of("hai","ba","bon","hai").distinct()
                .forEach(System.out::println);
    }
    @Test
    void testOfFunction1(){
       List<String> list = Arrays.asList("hai","ba","bon","hai");
       list.stream()
             .distinct()
             .filter(predicateStr).forEach(consumerString);
    }

    @Test
    void testFlatMap(){
        try{
            long noOfWords = Files.lines(Paths.get("test/text.txt"))
                    .flatMap((l-> Arrays.stream(l.split(" +"))))
                    .distinct()
                    .count();
            System.out.println("No of Words: "+noOfWords );

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    // 1 element tao 1 stream nua, flat là làm phẳng ra
    @Test
    void testFlatMapClear(){
//        try{
//            Stream<String> stringStream = Files.lines(Paths.get("text.txt"));
//            Stream<String> newStream =  long noOfWords = Files.lines(Paths.get("test/text.txt"))
//                    .flatMap((l-> Arrays.stream(l.split(" +"))))
//                    .distinct()
//                    .count();
//            System.out.println("No of Words: "+noOfWords );
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }


}
