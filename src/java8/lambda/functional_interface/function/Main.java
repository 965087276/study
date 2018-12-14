package java8.lambda.functional_interface.function;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
public class Main {

    private static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(f.apply(t));
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = map(
                Arrays.asList("lambda", "is", "very", "strong"),
                s -> s.length()
        );
        log.info("The length of these strings are : {}", list);
    }
}
