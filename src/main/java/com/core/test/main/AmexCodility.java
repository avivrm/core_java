package main.java.com.core.test.main;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AmexCodility {

    public static void main(String[] args) {
        int[] arr={3,5,6,3,3,5};

        process(arr);
    }

    public static void process(int[] arr){
        Map<Integer, Long> occurrences =
                IntStream.of(arr).boxed().collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting()));

        long count =
                occurrences.values().stream()
                        .mapToLong(e -> e * (e - 1) / 2)
                        .sum();

        System.out.println(count);
    }
}
